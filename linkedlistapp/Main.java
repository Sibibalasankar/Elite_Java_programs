package linkedlistapp;

import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        LinkedList list = new LinkedList();

        while (true) {
            System.out.println("Enter your choice: \n 1.Add element \n 2.Search for element \n 3.Delete Element \n 4.Print the data \n 5.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Elements: (Formate must be 1,2,3,4...)");
                    String values = sc.next();
                    // String[] nums = values.split(",");
                    String[] nums = values.split("[^0-9]");
                    for (String num : nums) {
                        if (num.matches("\\d+")) {
                            int valid_num = Integer.parseInt(num);
                            list.add(valid_num);
                        }
                    }
                    break;
                case 2:
                    System.out.println("This Feature is Comming soon!\n");
                    break;
                case 3:
                    System.out.println("This Feature is Comming soon!\n");
                    break;
                case 4:
                    list.printList();
                    break;
                case 5:
                    System.out.println("Bye Bye!!");
                    return;
            }

        }

    }
}
