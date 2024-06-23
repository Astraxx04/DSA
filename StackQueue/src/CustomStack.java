import java.sql.SQLOutput;

public class CustomStack {
    protected int data[];
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    public CustomStack() {
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == - 1;
    }

    public boolean push(int item) throws StackException {
        if(isFull()) {
            throw new StackException("The stack is full");
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if(isEmpty()) {
            throw new StackException("The stack is empty");
        }
        return data[ptr--];
    }

    public int peak() throws StackException {
        if(isEmpty()) {
            throw new StackException("The stack is empty");
        }
        return data[ptr];
    }

    public void display() throws StackException {
        if(isEmpty()) {
            throw new StackException("The stack is empty");
        }
        for (int i = 0; i <= ptr; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws StackException {
        CustomStack sta = new CustomStack(10);
        sta.push(10);
        sta.push(20);
        sta.push(30);
        sta.display();
        sta.pop();
        sta.display();
    }
}
