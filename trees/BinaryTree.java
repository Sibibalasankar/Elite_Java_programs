package trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    Node root;

    public BinaryTree() {
        root = null;
    }

    void insert(int data) {

        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();

            if (temp.left == null) {
                temp.left = newNode;
                return;
            } else {
                q.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = newNode;
                return;
            } else {
                q.add(temp.right);
            }
        }
    }



    void bfs(Node root){
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp=q.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        bt.insert(10);
        bt.insert(20);
        bt.insert(30);
        bt.insert(40);
        bt.insert(50);

        System.out.println("Inorder Traversal:");
       
    }
}