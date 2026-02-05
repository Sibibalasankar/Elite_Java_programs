import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Student {
    private String name;
    private int regno;
    private String rollno;
    private int year;
    private String dept;
    private double cgpa;
    private int m1, m2, m3;
    private char sec;

    Student(String d) {
        AddEntry(d);
        createRollno();
        calculatecgpa(m1, m2, m3);
    }

    private void AddEntry(String d) {
        String[] data = new String[5];
        data = d.split(",");
        name = data[0];
        regno = Integer.parseInt(data[1]);
        year = Integer.parseInt(data[2]);
        dept = data[3];
        sec = data[4].charAt(0);
        m1=Integer.parseInt(data[5]);
        m2=Integer.parseInt(data[6]);
        m3=Integer.parseInt(data[7]);

    }

    private void createRollno() {
        int a = year - 4;
        String y = Integer.toString(a);
        rollno = y.substring(2, 4) + dept.substring(0, 2) + sec + validatereg(regno);
    }

    private String validatereg(int reg) {
        if (reg > 0 && reg < 9) {
            return "0" + Integer.toString(reg);
        } else {
            return Integer.toString(reg);
        }
    }

    void displaydetails() {
        System.out.println("-----Student Details-----");
        System.out.println("Name: " + name);
        System.out.println("Reg No: " + regno);
        System.out.println("Year: " + year);
        System.out.println("Department: " + dept);
        System.out.println("Section: " + sec);
        System.out.println("Roll No: " + rollno);
        System.out.println("CGPA: " + cgpa);
    }

    String getrollno() {
        return rollno;
    }

    private void calculatecgpa(int m1, int m2, int m3) {
        cgpa = m1 + m2 + m3 /3 ;
    }

    static void findstudentdept(Student[] s,String d,int c,int[] l){
        int j=0;
        for(int i=0;i<c;i++){
            if(s[i].dept.equals(d)){
                System.out.println("-------- Details Found --------!");
                l[j++] = i;
            }
        }
    }   
}