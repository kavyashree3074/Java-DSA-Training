package assignment5.module14;
class Nodes {
    int data;
    Nodes left, right;
    Nodes(int value){
        data = value;
        left = right = null;
    }
}

public class InorderTraversal {
    Nodes root;

    void inorder(Nodes node){
        if(node != null){
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args){
        InorderTraversal tree = new InorderTraversal();
        tree.root = new Nodes(1);
        tree.root.left = new Nodes(2);
        tree.root.right = new Nodes(3);

        tree.inorder(tree.root);
    }
}