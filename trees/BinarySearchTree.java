package trees;

public class BinarySearchTree {

    Node root;

    public BinarySearchTree() {
        root = null;
    }

    void insert(int data) {

        Node nn = new Node(data);

        if (root == null) {
            root = nn;
            return;
        }

        Node temp = root;

        while (true) {

            if (data < temp.data) {
                if (temp.left == null) {
                    temp.left = nn;
                    return;
                }
                temp = temp.left;
            } 
            else if (data > temp.data) {
                if (temp.right == null) {
                    temp.right = nn;
                    return;
                }
                temp = temp.right;
            } 
            else {
                return; 
            }
        }
    }
    void inorderprint(){
        inorder(root);
    }
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);

        System.out.println("Inorder Traversal:");
        bst.inorderprint();
    }
}