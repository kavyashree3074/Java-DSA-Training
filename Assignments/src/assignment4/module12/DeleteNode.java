package assignment4.module12;

public class DeleteNode {

    Node head;   // using existing Node class

    void insert(int data) {
        Node n = new Node(data);
        if (head == null) head = n;
        else {
            Node t = head;
            while (t.next != null) t = t.next;
            t.next = n;
        }
    }

    void delete(int key) {

        if (head == null) return;

        // if first node is to be deleted
        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != key)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    void display() {
        for (Node t = head; t != null; t = t.next)
            System.out.print(t.data + " ");
    }

    public static void main(String[] args) {

        DeleteNode list = new DeleteNode();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.delete(20);   // delete value 20

        list.display();
    }
}