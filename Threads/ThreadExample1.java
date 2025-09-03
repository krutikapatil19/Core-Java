//Method 1: Create Thread by extending Thread class
class MyThread extends Thread {
    public void run() {
        //run() contains the code that thread will execute 
        System.out.println("Thread is running...");
    }
}
public class ThreadExample1 {
    public static void main(String[] args) {
        MyThread t = new MyThread();                //create thread object
        t.start();                                  //start thread -> internally calls run()
    }
}


/*run() -> code for thread
 * start() -> actuaally starts new thread (not run() directly).
 */