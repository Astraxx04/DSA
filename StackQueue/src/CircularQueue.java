public class CircularQueue {
    protected int data[];
    private static final int DEFAULT_SIZE = 10;
    int end = 0;
    int front = 0;
    int size = 0;
    public CircularQueue() {
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) throws QueueException {
        if(isFull()) {
            throw new QueueException("The queue is full");
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws QueueException {
        if(isEmpty()) {
            throw new QueueException("The queue is empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() throws QueueException {
        if(isEmpty()) {
            throw new QueueException("The queue is empty");
        }
        return data[front];
    }

    public void display() throws QueueException {
        if(isEmpty()) {
            throw new QueueException("The queue is empty");
        }
        int i = front;
        do{
            System.out.print(data[i] + " ");
            i++;
            i = i % data.length;
        }while (i != end);
        System.out.println();
    }

    public static void main(String[] args) throws QueueException {
        CircularQueue cq = new CircularQueue(10);
        cq.insert(10);
        cq.insert(20);
        cq.insert(30);
        cq.insert(40);
        cq.insert(50);
        cq.display();
        cq.remove();
        cq.remove();
        cq.display();
    }
}
