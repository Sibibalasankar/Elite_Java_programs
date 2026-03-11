package linkedlistapp;

import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        LinkedList list = new LinkedList();

        while (true) {
            System.out.println("Enter your choice: \n 1.Add element \n 2.Append Element \n 3.Insert Element at First Node \n 4.Print the data \n 5.Get Number of Nodes \n 6.Find the Second last Element \n 7.Insert Element \n 8.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Elements: (Formate must be 1,2,3,4...)");
                    String values = sc.next();
                    String[] nums = values.split("[^0-9]+");
                    for (String num : nums) {
                        if (num.matches("\\d+")) {
                            int valid_num = Integer.parseInt(num);
                            list.add(valid_num);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter the Element: ");
                    int value = sc.nextInt();
                    list.add(value);
                    break;
                case 3:
                    System.out.println("Enter the Element: ");
                    int val = sc.nextInt();
                    list.insertAtFirst(val);
                    break;
                case 4:
                    list.printForward();
                    break;
                case 5:
                    System.out.println("Number of Nodes: " + list.size());
                    break;
                case 6:
                    list.findSecondLastElement();
                    return;
                case 7:
                    System.out.println("Enter the Position to insert:");
                    int position = sc.nextInt();
                    if(position < 1 || position > list.size() + 1) {
                        System.out.println("Invalid Position");
                        break;
                    }
                    System.out.println("Enter the Element to insert:");
                    int element = sc.nextInt();
                    list.InsertElement(position,element);
                    break;
                case 8:
                    System.out.println("Bye Bye!!");
                    sc.close();
                    return;
            }

        }

    }
}
