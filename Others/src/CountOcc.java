import java.util.Scanner;

public class CountOcc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 123452234;
        System.out.println("Enter the number whose occurrence is to be found");
        int key = sc.nextInt();
        int count = 0;
        while (num > 0){
            int x = num % 10;
            num = num / 10;
            if(x==key)
                count +=1;
        }
        System.out.println("Number "+key+" appears "+count+" times");
    }
}
