package queuetasks;

public class CircularQueueUsingArray {

    int[] queue;
    int front;
    int rear;
    int size;
    int n;

    CircularQueueUsingArray(int n){
        this.n = n;
        queue = new int[n];
        front = -1;
        rear = -1;
        size = 0;
    }

    void enqueue(int value){

        if(size == n){
            System.out.println("Queue is Full");
            return;
        }

        if(front == -1){
            front = 0;
        }

        rear = (rear + 1) % n;
        queue[rear] = value;
        size++;

        System.out.println(value + " inserted");
    }

    void dequeue(){

        if(size == 0){
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println(queue[front] + " removed");

        front = (front + 1) % n;
        size--;

        if(size == 0){
            front = rear = -1;
        }
    }

    void print(){

        if(size == 0){
            System.out.println("Queue is Empty");
            return;
        }

        int i = front;
        int count = 0;

        while(count < size){
            System.out.print(queue[i] + " ");
            i = (i + 1) % n;
            count++;
        }

        System.out.println();
    }
}