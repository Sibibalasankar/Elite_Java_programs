package stuapp;

import java.io.*;
import java.util.*;

public class Student {

    private static boolean validateStudentLogin(String uname, String pass) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("stuapp/studentCred.txt"));
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

    public static boolean studentLogin() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Username:");
        String uname = sc.next();
        System.out.println("Enter Student Password:");
        String pass = sc.next();

        return validateStudentLogin(uname, pass);
    }

    public static void viewProfile() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("stuapp/studentData.txt"));
        String line;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    public static void viewMarks() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("stuapp/marks.txt"));
        String line;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}