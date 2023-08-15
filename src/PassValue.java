public class PassValue {
    public static void main(String[] args) {
        String x = "This will be changed";
        int a = 10;
        change(a);
        System.out.println(a);
    }

    static void change(int x) {
//        x = "The changed string";
        x = 20;
    }
}
