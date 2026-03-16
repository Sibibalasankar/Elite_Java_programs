package queuetasks;

class LinkedList {

    private Node front, rear;
    private int size = 0;
    private int capacity;

    LinkedList(int capacity) {
        this.capacity = capacity;
        front = rear = null;
    }

    public void enqueue(int value) {

        if (size == capacity) {
            System.out.println("Queue Overflow");
            return;
        }

        Node newnode = new Node(value);

        if (front == null) {
            front = rear = newnode;
        } else {
            rear.next = newnode;
            rear = newnode;
        }

        size++;
    }

    public void dequeue() {

        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        if (front.next == null) {
            System.out.println(front.data + " removed");
            front = rear = null;
            size--;
            return;
        }

        Node temp = front;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        System.out.println(temp.next.data + " removed");

        temp.next = null;
        rear = temp;
        size--;
    }

    public void print() {

        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}
