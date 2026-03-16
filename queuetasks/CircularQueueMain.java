package queuetasks;

import java.util.Scanner;

public class CircularQueueMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Queue Capacity: ");
        int capacity = sc.nextInt();

        CircularQueueUsingArray q = new CircularQueueUsingArray(capacity);

        int choice, value;

        while(true){

            System.out.println("\n1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Print");
            System.out.println("4.Exit");

            choice = sc.nextInt();

            switch(choice){

                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    q.enqueue(value);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.print();
                    break;

                case 4:
                    System.out.println("Exit");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}