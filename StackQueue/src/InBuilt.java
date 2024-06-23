import java.util.*;

public class InBuilt {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());

        Queue<Integer> que = new LinkedList<>();
        que.add(2);
        que.add(4);
        que.add(6);
        que.add(8);
        System.out.println(que.peek());
        System.out.println(que.remove());
        System.out.println(que.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.addLast(20);
        deque.removeFirst();
    }
}
