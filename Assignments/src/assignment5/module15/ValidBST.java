package assignment5.module15;
class Node4 {
    int data;
    Node4 left, right;

    Node4(int value){
        data = value;
        left = right = null;
    }
}

public class ValidBST {

    Node root;

    boolean isBST(Node root, int min, int max){

        if(root == null)
            return true;

        if(root.data <= min || root.data >= max)
            return false;

        return isBST(root.left, min, root.data) &&
                isBST(root.right, root.data, max);
    }

    public static void main(String[] args){

        ValidBST tree = new ValidBST();

        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(70);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(40);

        if(tree.isBST(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE))
            System.out.println("Valid BST");
        else
            System.out.println("Not a BST");
    }
}