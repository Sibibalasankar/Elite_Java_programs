package stacktasks;

import java.util.Scanner;

public class StackApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StackTask st = new StackTask();

        while(true){

            System.out.println("\nEnter your choice:");
            System.out.println("1.Insert into Stack (Push)");
            System.out.println("2.Remove element (Pop)");
            System.out.println("3.Print Elements");
            System.out.println("0.Exit");

            int choice = sc.nextInt();

            switch(choice){

                case 1:
                    System.out.println("Enter the Element:");
                    int element = sc.nextInt();
                    st.push(element);
                    break;

                case 2:
                    st.pop();
                    break;

                case 3:
                    st.printStack();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
