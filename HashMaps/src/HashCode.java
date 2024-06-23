public class HashCode {
    public static void main(String[] args) {
        String x = "Gagan";
        Integer y = 1234567890;
        int code1 = x.hashCode();
        int code2 = y.hashCode();
        System.out.println(code1 + " " + code2);
    }
}
