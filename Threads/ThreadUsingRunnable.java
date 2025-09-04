//Method 2: Create Thread by implementing Runnable
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread using Runnable is running...");
    }
}

public class ThreadUsingRunnable {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);               //pass runnable to thread
        t.start();                              //start thread
    }
}

//Runnable helps when the class already extends something else.