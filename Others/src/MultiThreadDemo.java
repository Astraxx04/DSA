class myThread implements Runnable {
    String name;
    public myThread(String threadName) {
        name = threadName;
    }
    public void run()
    {
        try
        { for(int i = 5; i > 0; i--) {
            System.out.println( name + ": " + i); Thread.sleep(1000); }
        }
        catch (InterruptedException e)
        {
            System.out.println(name + "Interrupted");
        }
        System.out.println( name + " exiting.");
    }
}
public class MultiThreadDemo { public static void main(String args[]) {
    Thread t1 = new Thread ( new myThread ("One") );
    Thread t2 = new Thread ( new myThread ("Two") );
    t1.start();
    t2.start();
} }