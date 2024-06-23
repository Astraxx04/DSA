public class CustomQueue {
    protected int data[];
    private static final int DEFAULT_SIZE = 10;
    int end = -1;
    public CustomQueue() {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length - 1;
    }

    public boolean isEmpty() {
        return end == -1;
    }

    public boolean insert(int item) throws QueueException {
        if(isFull()) {
            throw new QueueException("The queue is full");
        }
        end++;
        data[end] = item;
        return true;
    }

    public int remove() throws QueueException {
        if(isEmpty()) {
            throw new QueueException("The queue is empty");
        }
        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws QueueException {
        if(isEmpty()) {
            throw new QueueException("The queue is empty");
        }
        return data[0];
    }

    public void display() throws QueueException {
        if(isEmpty()) {
            throw new QueueException("The queue is empty");
        }
        for (int i = 0; i <= end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws QueueException {
        CustomQueue que = new CustomQueue(10);
        que.insert(10);
        que.insert(20);
        que.insert(30);
        que.display();
        que.remove();
        que.display();
    }
}
