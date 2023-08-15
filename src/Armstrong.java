public class Armstrong {
    public static void main(String[] args) {
        for(int i =100; i <= 999; i++){
            if(isArmstrong(i))
                System.out.print(i + " ");
        }
    }

    static boolean isArmstrong(int a){
        int sum = 0, n = a;
        while(n > 0){
            int r = n % 10;
            sum += r*r*r;
            n = n / 10;
        }
        return a == sum;
    }
}
