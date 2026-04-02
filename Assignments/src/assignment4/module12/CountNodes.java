package assignment4.module12;

public class CountNodes {

    Node head;

    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    int count() {
        int c = 0;
        Node temp = head;

        while (temp != null) {
            c++;
            temp = temp.next;
        }

        return c;
    }

    public static void main(String[] args) {
        CountNodes list = new CountNodes();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.println("Count: " + list.count());
    }
}

