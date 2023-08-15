class Counter {
    int c1 = 0;
    static int c2;
    Counter() {
        c1++;
        c2++;
    }
    void display() {
        System.out.print("First Counter : " + c1);
        System.out.println(" Second Counter : " + c2);
    }
}
public class StaticDemo {
    public static void main(String[] args) {
        Counter o1 = new Counter();
        Counter o2 = new Counter();
        Counter o3 = new Counter();
        o1.display();
        o2.display();
        o3.display();
    }
}
