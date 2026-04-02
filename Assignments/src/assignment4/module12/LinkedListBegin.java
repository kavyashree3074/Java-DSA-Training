package assignment4.module12;

public class LinkedListBegin {

    Node head;

    void insertBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListBegin list = new LinkedListBegin();

        list.insertBegin(30);
        list.insertBegin(20);
        list.insertBegin(10);

        list.display();
    }
}