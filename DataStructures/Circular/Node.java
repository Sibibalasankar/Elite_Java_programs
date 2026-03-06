import java.util.*;

public class Node {

    int data;
    Node prev;
    Node next;

    Node(int a) {
        this.data = a;
        this.prev = null;
        this.next = null;
    }

    static Node first = null;
    static Node last = null;

    static void PrintList() {

        if(first == null) return;

        Node temp = first;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while(temp != first);
    }

    static void PrintBackwards() {

        if(last == null) return;

        Node temp = last;

        do {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        } while(temp != last);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        while (a != -1) {

            Node temp = new Node(a);

            if (first == null) {
                first = temp;
                last = temp;
            } 
            else {
                last.next = temp;
                temp.prev = last;
                last = temp;
            }

            a = sc.nextInt();
        }

        last.next = first;
        first.prev = last;

        PrintList();
        System.out.println();
        PrintBackwards();
    }
}