package arraytasks;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayTask arr = new ArrayTask();

        while(true){

            System.out.println("\nEnter your Choice:");
            System.out.println("1. Insert at Position");
            System.out.println("2. Add Element");
            System.out.println("3. Delete Element");
            System.out.println("4. Rotate Array");
            System.out.println("5. Print Array");
            System.out.println("6. Exit");

            int ch = sc.nextInt();

            switch(ch){

                case 1:
                    System.out.println("Enter Position:");
                    int position = sc.nextInt();

                    System.out.println("Enter Element:");
                    int element = sc.nextInt();

                    arr.insertValue(position, element);
                    break;

                case 2:
                    System.out.println("Enter Element:");
                    arr.addElement(sc.nextInt());
                    break;

                case 3:
                    System.out.println("Enter Position to Delete:");
                    arr.deleteValue(sc.nextInt());
                    break;

                case 4:
                    System.out.println("1. Rotate Left");
                    System.out.println("2. Rotate Right");
                    int type = sc.nextInt();

                    System.out.println("How many rotations?");
                    int k = sc.nextInt();

                    arr.rotate(type, k);
                    break;

                case 5:
                    arr.printArray();
                    break;

                case 6:
                    System.out.println("Bye Bye!!");
                    return;
            }
        }
    }
}