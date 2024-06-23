public class SinglyLL {
    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
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
        head = node;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            return;
        }
        Node cur = head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    public void insertLastWoTail(int val) {
        Node node = new Node(val);
        Node cur;
        if(head == null) {
            head = node;
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
        Node node = new Node(val);
        if(head == null || index == 0) {
            node.next = head;
            head = node;
            return;
        }
        Node cur = head;
        for(int i = 1; i < index; i++) {
            cur = cur.next;
        }
        node.next = cur.next;
        cur.next = node;
    }

    public void insertRecursion(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val);
            temp.next = node;
            return temp;
        }
        node.next = insertRec(val, index--, node.next);
        return node;
    }

    public void deleteFirst() {
        if(head == null) {
            System.out.println("The list is empty");
            return;
        }
        int val = head.data;
        System.out.println("Element " + val + " is deleted");
        head = head.next;
    }

    public void deleteLast() {
        int val;
        if(head == null) {
            System.out.println("The list is empty");
            return;
        } else if (head.next == null) {
            val = head.data;
            head = null;
            System.out.println("Element " + val + " is deleted");
            return;
        }
        Node cur = head;
        Node prev = null;
        while(cur.next != null) {
            prev = cur;
            cur = cur.next;
        }
        val = cur.data;
        prev.next = null;
        System.out.println("Element " + val + " is deleted");
    }

    public void delete(int index) {
        int val;
        if (index == 0) {
            if(head == null) {
                System.out.println("The list is empty");
                return;
            }
            val = head.data;
            head = head.next;
            System.out.println("Element " + val + " is deleted");
            return;
        }
        Node cur = head, prev = null;
        for(int i = 0; i < index; i++) {
            prev = cur;
            cur = cur.next;
            if (cur == null || cur.next.next == null) {
                System.out.println("Invalid index");
                return;
            }
        }
        val = cur.data;
        System.out.println("Element " + val + " is deleted");
        prev.next = cur.next;
    }

    public void display() {
        Node cur = head;
        while(cur != null) {
            System.out.print(cur.data+ " -> ");
            cur = cur.next;
        }
        System.out.println("null");
    }

    private void reverse(Node head) {
        
    }

    public static void main(String[] args) {
        SinglyLL sll = new SinglyLL();
        sll.insertRecursion(22, 0);
        sll.insertRecursion(32, 0);

        sll.display();
    }

}
