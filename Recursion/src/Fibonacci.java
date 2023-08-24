public class Fibonacci {
    public static void main(String[] args) {
//        System.out.println(fibonacci(46));
        for (int i = 0; i < 11; i++) {
            System.out.println(fiboFormula(i));
        }
    }
    static int fiboFormula(int n) {
        return (int)(( Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n) ) / Math.sqrt(5)); //Second half is less dominating hence can be removed
    }
    static int fibonacci(int n) {
        if(n < 2) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}