package queuetasks;

import java.util.Scanner;

public class DequeArrayMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Capacity: ");
        int capacity = sc.nextInt();

        DoubleEndedQueueArray dq = new DoubleEndedQueueArray(capacity);

        int choice,value;

        while(true){

            System.out.println("\n1.Insert Front");
            System.out.println("2.Insert Rear");
            System.out.println("3.Delete Front");
            System.out.println("4.Delete Rear");
            System.out.println("5.Print");
            System.out.println("6.Exit");

            choice = sc.nextInt();

            switch(choice){

                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    dq.insertFront(value);
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    dq.insertRear(value);
                    break;

                case 3:
                    dq.deleteFront();
                    break;

                case 4:
                    dq.deleteRear();
                    break;

                case 5:
                    dq.print();
                    break;

                case 6:
                    System.out.println("Exit");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}