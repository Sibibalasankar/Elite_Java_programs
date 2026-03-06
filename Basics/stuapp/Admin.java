package stuapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Admin {
    static String adminUname;
    static String password;

    private static boolean validateAdminLogin(String tempadminUname, String temppassword) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader("stuapp/adminCred.txt"));
        String line = "";
        while ((line = br.readLine()) != null) {
            String[] adminData = line.split(",");
            if (adminData[0].equals(tempadminUname) && adminData[1].equals(temppassword)) {
                return true;
            }
        }
        return false;
    }

    public static boolean adminLogin() throws IOException {
        boolean status = false;
        while (status == false) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Username: ");
            String tempadminUname = sc.next();
            System.out.println("Enter Password: ");
            String temppassword = sc.next();
            status = validateAdminLogin(tempadminUname, temppassword);
            if (status == false) {
                System.out.println("Enter 1.Return to Admin Login");
                int tempStatus = sc.nextInt();

                if (tempStatus == 1)
                    break;
            }
        }
        return status;
    }

    public static void main(String[] args) throws IOException {
    }

    public static void viewDB() throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(
                new FileReader("stuapp/data.txt"));
        String line = "";
        System.out.println("1.View FullDb 2.Display by Year 3.Exit");
        int caseId;
        caseId = sc.nextInt();
        switch (caseId) {
            case 1:
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                break;
            case 2:
                System.out.println("Enter Year:");
                String year=sc.next();
                while ((line = br.readLine()) != null) {
                    String[] data=line.split(",");
                    if(data[3].equals(year)){
                        System.out.println(line);
                    }
                }
                br.close();
                break;
            case 3:
                return;
        }
    }

}