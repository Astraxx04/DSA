import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int fib = 0;
//        for (int i=1, a=0, b=1; i < num ; i++) {
//            fib=a+b;
//            a=b;
//            b=fib;
//        }
        int a=0, b=1, count=2;
        while(count <= num){
            fib = a+b;
            System.out.println(fib);
            a = b;
            b = fib;
            count++;
        }
        System.out.println("Fibonacci:" +fib);
    }
}
