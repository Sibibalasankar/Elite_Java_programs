package stuapp;

import java.io.*;
import java.util.*;

public class Staff {

    private static boolean validateStaffLogin(String uname, String pass) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("stuapp/staffCred.txt"));
        String line;

        while((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if(data[0].equals(uname) && data[1].equals(pass)) {
                br.close();
                return true;
            }
        }
        br.close();
        return false;
    }

    public static boolean staffLogin() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Staff Username:");
        String uname = sc.next();
        System.out.println("Enter Staff Password:");
        String pass = sc.next();

        return validateStaffLogin(uname, pass);
    }

    public static void viewProfile() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("stuapp/staffData.txt"));
        String line;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    public static void viewStudents() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("stuapp/studentData.txt"));
        String line;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
