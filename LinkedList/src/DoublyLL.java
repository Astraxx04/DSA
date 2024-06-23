public class DoublyLL {
    private class Node {
        private int data;
        private Node next;
        private Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    private Node head = null;

    public void insertFirst(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            return;
        }
        Node cur = head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
        node.prev = cur;
    }

    public void display() {
        Node cur = head;
        while(cur != null) {
            System.out.print(cur.data+ " -> ");
            cur = cur.next;
        }
        System.out.println("null");
    }

    public void displayReverse() {
        Node cur = head;
        Node last = null;
        while(cur != null) {
            System.out.print(cur.data+ " -> ");
            last = cur;
            cur = cur.next;
        }
        System.out.println("null");

        System.out.println("Print in reverse");
        while (last != null) {
            System.out.print(last.data+ " -> ");
            last = last.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.insertFirst(10);
        dll.insertFirst(20);
        dll.insertFirst(30);
        dll.insertFirst(40);
        dll.insertLast(50);
        dll.insertLast(60);
        dll.displayReverse();
    }

}
