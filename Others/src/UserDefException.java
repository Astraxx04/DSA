import java.util.Scanner;
import java.lang.*;
class MyException extends Exception {
    public MyException(String message){
        super(message);
    }
}


public class UserDefException{
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter age");
            age = sc.nextInt();
            if (age < 15 || age > 25)
                throw new MyException("Number not in range");
            System.out.println("Age is " + age);
        }
        catch(MyException e){
            System.out.println("Caught myException");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}