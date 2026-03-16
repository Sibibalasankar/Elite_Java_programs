package queuetasks;

public class DoubleEndedQueueArray {

    int[] deque;
    int front;
    int rear;
    int size;
    int capacity;

    DoubleEndedQueueArray(int capacity){
        this.capacity = capacity;
        deque = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    void insertFront(int value){

        if(size == capacity){
            System.out.println("Queue is Full");
            return;
        }

        if(front == -1){
            front = rear = 0;
        }
        else if(front == 0){
            front = capacity - 1;
        }
        else{
            front--;
        }

        deque[front] = value;
        size++;

        System.out.println(value + " inserted at Front");
    }

    void insertRear(int value){

        if(size == capacity){
            System.out.println("Queue is Full");
            return;
        }

        if(front == -1){
            front = rear = 0;
        }
        else if(rear == capacity - 1){
            rear = 0;
        }
        else{
            rear++;
        }

        deque[rear] = value;
        size++;

        System.out.println(value + " inserted at Rear");
    }

    void deleteFront(){

        if(size == 0){
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println(deque[front] + " removed from Front");

        if(front == rear){
            front = rear = -1;
        }
        else if(front == capacity - 1){
            front = 0;
        }
        else{
            front++;
        }

        size--;
    }

    void deleteRear(){

        if(size == 0){
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println(deque[rear] + " removed from Rear");

        if(front == rear){
            front = rear = -1;
        }
        else if(rear == 0){
            rear = capacity - 1;
        }
        else{
            rear--;
        }

        size--;
    }

    void print(){

        if(size == 0){
            System.out.println("Queue is Empty");
            return;
        }

        int i = front;
        int count = 0;

        while(count < size){
            System.out.print(deque[i] + " ");
            i = (i + 1) % capacity;
            count++;
        }

        System.out.println();
    }
}