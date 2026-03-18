package linkedlistapp;

class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    static SinglyLinkedListNode head = null;
    static SinglyLinkedListNode last = null;

    public SinglyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }

    static void add(int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        if (head == null) {
            head = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    static boolean findRec(SinglyLinkedListNode node, int key) {
        if (node == null) {
            return false;
        }
        if (node.data == key) {
            return true;
        }
        return findRec(node.next, key);
    }

    static void printList() {
        SinglyLinkedListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class FindInLinkedList {
    public static void main(String[] args) {

        SinglyLinkedListNode.add(1);
        SinglyLinkedListNode.add(2);
        SinglyLinkedListNode.add(3);
        SinglyLinkedListNode.add(4);
        SinglyLinkedListNode.add(5);

        SinglyLinkedListNode.printList();

        int key = 3;

        boolean found = SinglyLinkedListNode.findRec(SinglyLinkedListNode.head, key);

        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}