import java.util.*;

class Node {
    int data;
    Node next;

    Node(int a){
        this.data = a;
        this.next = null;
    }
}

class Linkdlist{

    static Node first = null;
    static Node last = null;

    static void PrintList(){
        Node temp = first;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
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
                last = temp;
            }

            a = sc.nextInt();
        }

        PrintList();
    }
}