package datadstructures.linkedlist.double;

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
        Node temp = first;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static void PrintBackwards(Node last) {
        Node temp = last;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        while (a != -1) {

            Node temp = new Node(a);

            if (first == null) {
                first = temp;
                last = temp;
            } else {
                last.next = temp;
                temp.prev = last;
                last = temp;
            }

            a = sc.nextInt();
        }

        // PrintList();
        PrintBackwards(last);
    }
}
