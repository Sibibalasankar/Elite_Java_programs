import java.util.*;

public class main {

    public static int findstudent(String f, Student[] s, int c) {
        for (int i = 0; i < c; i++) {
            if (s[i].getrollno().equals(f)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dbsize = 3;
        Student[] s = new Student[dbsize];
        int count = 0;
        while (true) {
            System.out.println("\nEnter Your Choice: \n 1.Add DB \n 2.Print the Data \n 3.Search for Data \n 4.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.println("Enter Data in the format Name,Regno,Year,Dept,Sec,mark1,mark2,mark3");
                    String data = sc.nextLine();
                    if (count >= dbsize) {
                        System.out.println("Database Full");
                        break;
                    } else {
                        s[count++] = new Student(data);
                        break;
                    }
                case 2:
                    for (int i = 0; i < count; i++) {
                        s[i].displaydetails();
                    }
                    break;
                case 3:
                    System.out.println("Enter Roll No to search:");
                    String searchroll = sc.next();
                    int i = findstudent(searchroll, s, count);
                    if (i != -1) {
                        System.out.println("\nFound Student Details:");
                        s[i].displaydetails();
                    } else {
                        System.out.println("\nStudent Not Found!!");
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid Choice!!");
                    break;
            }
        }
    }
}