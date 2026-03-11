package linkedlistapp;

class LinkedList {

    private Node first, last;
    private int size = 0;

    LinkedList() {
        first = last = null;
    }

    public void add(int value) {
        Node newnode = new Node(value);
        size++;

        if (first == null) {
            first = newnode;
            last = newnode;
        } else {
            last.next = newnode;
            newnode.prev = last;
            last = newnode;
        }
    }

    public void printForward() {
        Node temp = first;

        if (temp == null) {
            System.out.println("LinkedList is Empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void printBackward() {
        Node temp = last;

        if (temp == null) {
            System.out.println("LinkedList is Empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public int size() {
        return size;
    }

    public void insertAtFirst(int value) {
        Node newnode = new Node(value);
        size++;

        if (first == null) {
            first = newnode;
            last = newnode;
        } else {
            newnode.next = first;
            first.prev = newnode;
            first = newnode;
        }
    }

    public void findSecondLastElement() {
        if (first == null) {
            System.out.println("LinkedList is Empty");
            return;
        } else if (first.next == null) {
            System.out.println("Only one element is present in the LinkedList");
            return;
        } else {
            Node temp = first;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            System.out.println("Second Last Element: " + temp.data);
        }
    }

    public void InsertElement(int position, int value) {
        if (position < 1 || position > size) {
            System.out.println("Invalid Position");
        }

        Node newnode = new Node(value);
        size++;
        Node temp = first;
        if (first == null) {
            first = newnode;
            last = newnode;
        } else if (position == 1) {
            newnode.next = first;
            first.prev = newnode;
            first = newnode;
        } else {
            for (int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }
            newnode.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = newnode;
            }
            temp.next = newnode;
            newnode.prev = temp;

            if (newnode.next == null) {
                last = newnode;
            }
        }
    }
}
