package treetasks;

import java.util.Scanner;

public class TreeTaskMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice:");
        System.out.println("1. Create a Binary Tree");
        System.out.println("2. Insert a Node");
        System.out.println("3. Display the Tree");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the value of root node:");
                int value = sc.nextInt();
                TreeImplementations tree = new TreeImplementations(value);
                break;
            case 2:
                
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
