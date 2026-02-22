package app;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dbsize = 3;
        Student[] s = new Student[dbsize];
        int count = 0;

        while (true) {

            System.out.println("\nEnter Your Choice: ");
            System.out.println("1.Add DB");
            System.out.println("2.Print the Data");
            System.out.println("3.Search for Data");
            System.out.println("4.Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();
                    System.out.println("Enter Data in format:");
                    System.out.println("Name,Regno,Year,Dept,Sec,mark1,mark2,mark3");

                    String data = sc.nextLine();

                    if (count >= dbsize) {
                        System.out.println("Database Full");
                        break;
                    }

                    try {
                        s[count] = new Student(data);
                        System.out.println("Student Added Successfully!");
                        count++;
                    } catch (DepartmentInvalidException e) {
                        System.out.println(e.getMessage());
                        try {
                            FileWriter fw = new FileWriter("app/user1.txt", true);
                            fw.write("Invalid Entry: " + data + "\n");
                            fw.close();
                        } catch (IOException io) {
                            System.out.println("Error writing to file.");
                        }

                    } catch (Exception e) {
                        System.out.println("Invalid Input Format!");
                    }

                    break;

                case 2:
                    for (int i = 0; i < count; i++) {
                        s[i].displaydetails();
                    }
                    break;

                case 3:
                    System.out.println(
                            "Search Options\n"
                            + "1. Year\n"
                            + "2. Roll No\n"
                            + "3. Department\n"
                            + "4. Section");

                    int searchOption = sc.nextInt();
                    sc.nextLine();

                    Student.searchStudent(sc, s, count, searchOption);
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid Choice!!");
            }
        }
    }
}
