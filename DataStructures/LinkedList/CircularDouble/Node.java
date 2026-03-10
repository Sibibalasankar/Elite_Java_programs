package DataStructures.linkedlist.CircularDouble;
import java.util.*;

public class Node {

    int data;
    Node prev;
    Node next;

    static Node first = null;
    static Node last = null;

    Node(int a){
        data = a;
        prev = null;
        next = null;
    }

    static void PrintList(){

        if(first == null)
            return;

        Node temp = first;

        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        }while(temp != first);
    }

    static void PrintBackwards(){

        if(last == null)
            return;

        Node temp = last;

        do{
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }while(temp != last);
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        while(a != -1){

            Node temp = new Node(a);

            if(first == null){
                first = temp;
                last = temp;
            }
            else{
                last.next = temp;
                temp.prev = last;
                last = temp;
            }

            a = sc.nextInt();
        }

        // make circular
        last.next = first;
        first.prev = last;

        PrintList();
        System.out.println();
        PrintBackwards();
    }
}