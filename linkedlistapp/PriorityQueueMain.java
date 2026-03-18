package linkedlistapp;


class PriorityNode {
    int data;
    int priority;
    PriorityNode next;

    public PriorityNode(int data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
    }
}

class PriorityQueueLL {
    PriorityNode head = null;

    void enqueue(int data, int priority) {
        PriorityNode newNode = new PriorityNode(data, priority);

        if (head == null || priority < head.priority) {
            newNode.next = head;
            head = newNode;
        } else {
            PriorityNode temp = head;
            while (temp.next != null && temp.next.priority <= priority) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    void dequeue() {
        if (head == null) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Removed: " + head.data);
        head = head.next;
    }

    void printQueue() {
        PriorityNode temp = head;
        while (temp != null) {
            System.out.print("(" + temp.data + ",p=" + temp.priority + ") ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class PriorityQueueMain {
    public static void main(String[] args) {

        PriorityQueueLL pq = new PriorityQueueLL();

        pq.enqueue(10, 2);
        pq.enqueue(20, 1);
        pq.enqueue(30, 3);
        pq.enqueue(40, 2);

        System.out.println("Priority Queue:");
        pq.printQueue();

        pq.dequeue();

        System.out.println("After Dequeue:");
        pq.printQueue();
    }
}