public class SinglyLinkedList {
    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node head = null;
    private Node tail = null;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null) {
            tail = head;
        }
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node cur;
        if (tail == null) {
            insertFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
    }

    public void insertLastWoTail(int val) {
        Node node = new Node(val);
        Node cur;
        if(head == null) {
            head = node;
            tail = node;
        }
        else {
            cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    public void insert(int val, int index) {
        if(index == 0) {
            insertFirst(val);
            return;
        }
        Node cur = head;
        for(int i = 1; i < index; i++) {
            cur = cur.next;
        }
        Node node = new Node(val);
        node.next = cur.next;
        cur.next = node;
    }

    public int deleteFirst() {
        int val = head.data;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        return val;
    }

    public void display() {
        Node cur = head;
        while(cur != null) {
            System.out.print(cur.data+ " -> ");
            cur = cur.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertLast(10);
        sll.insertLast(20);
        sll.insertLast(30);
        sll.deleteFirst();

        sll.display();
    }

}
