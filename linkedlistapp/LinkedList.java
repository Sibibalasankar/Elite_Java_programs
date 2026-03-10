package linkedlistapp;
class LinkedList {

    private Node first,last;

    LinkedList(){
        first=last=null;
    }

    public void add(int value){
        Node newnode = new Node(value);

        if(first==null){
            first=newnode;
            last=newnode;
        }else{
            last.next=newnode;
            last=newnode;
        }
    }

    public void printList(){
            Node start = first;
            if(start==null){
                System.out.println("LinkedList is Empty");
                return; 
            }
            while(start!=null){
                System.out.print(start.data + " ");
                start=start.next;
            }
            System.out.println();
    }
}