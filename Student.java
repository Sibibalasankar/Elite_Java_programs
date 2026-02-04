import java.util.*;

public class Student {

    private String rollno;
    private int regno;
    private String name;
    private double cgpa;
    private int m1, m2, m3;
    private char section;
    private String Dept;
    static int year;

    Student(Scanner sc) {
        System.out.println("Welcome User..!!\nEnter Your Details ");
        detailsEntry(sc);
        createRollno();
        displayDetals();

    }

    private void detailsEntry(Scanner sc) {
        System.out.println("Enter Regno: ");
        regno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Year: ");
        year = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Your Department: ");
        Dept = sc.nextLine();
        System.out.println("Enter Section: ");
        section = sc.nextLine().charAt(0);

    }

    private void createRollno() {
        int y = year - 4;
        String year_num = Integer.toString(y);
        rollno = year_num.substring(2, 4);
        rollno = rollno + Dept.substring(0, 2) + section + Integer.toString(regno);
    }

    private void displayDetals() {
        System.out.println("Name: " + name + "\nYear:" + year + "\nRollNo: " + validatereg(regno));
    }

    private String validatereg(int r){
        if(r >= 0 && r<9){
            return Integer.toString(r);
        }

    }
}