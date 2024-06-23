public class CircularLL {
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

    public void insert(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        Node cur = head;
        if(head != null) {
            do{
                System.out.print(cur.data + " -> ");
                cur = cur.next;
            }while (cur != head);
        }
        System.out.println("head");
    }

    public void delete(int val) {
        Node node = head;
        if(node == null) {
            return;
        }
        if(node.data == val) {
            head = head.next;
            tail.next = head;
            return;
        } 
        do {
            Node n = node.next;
            if(n.data == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node != head);
    }

    public static void main(String[] args) {
        CircularLL cll = new CircularLL();
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.display();
        cll.delete(0);
        cll.display();
    }
}
