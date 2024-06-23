public class DiffProdSum {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }
    public static int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        while(n > 0) {
            int r = n % 10;
            n = n / 10;
            prod = prod * r;
            sum = sum + r;
        }
        return (prod-sum);
    }
}
