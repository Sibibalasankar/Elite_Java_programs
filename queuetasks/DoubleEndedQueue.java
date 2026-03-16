package queuetasks;

public class DoubleEndedQueue {

    Node front;
    Node rear;
    int size;
    int capacity;

    DoubleEndedQueue(int capacity){
        this.capacity = capacity;
        this.size = 0;
        front = null;
        rear = null;
    }

    void insertFront(int value){

        if(size == capacity){
            System.out.println("Queue is Full");
            return;
        }

        Node newNode = new Node(value);

        if(front == null){
            front = rear = newNode;
        }else{
            newNode.next = front;
            front = newNode;
        }

        size++;
        System.out.println(value + " inserted at Front");
    }

    void insertRear(int value){

        if(size == capacity){
            System.out.println("Queue is Full");
            return;
        }

        Node newNode = new Node(value);

        if(rear == null){
            front = rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }

        size++;
        System.out.println(value + " inserted at Rear");
    }

    void deleteFront(){

        if(front == null){
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println(front.data + " removed from Front");

        front = front.next;

        if(front == null){
            rear = null;
        }

        size--;
    }

    void deleteRear(){

        if(rear == null){
            System.out.println("Queue is Empty");
            return;
        }

        if(front == rear){
            System.out.println(rear.data + " removed from Rear");
            front = rear = null;
        }else{

            Node temp = front;

            while(temp.next != rear){
                temp = temp.next;
            }

            System.out.println(rear.data + " removed from Rear");
            temp.next = null;
            rear = temp;
        }

        size--;
    }

    // Print Queue
    void print(){

        if(front == null){
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = front;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}