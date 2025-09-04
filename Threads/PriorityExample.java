class PriorityThread extends Thread {
    public void run() {
        System.out.println("Running thread: " + Thread.currentThread().getName() + "with priority: " + Thread.currentThread().getPriority());
    }
}

public class PriorityExample {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread();
        PriorityThread t2 = new PriorityThread();

        t1.setPriority(Thread.MIN_PRIORITY);        //1
        t2.setPriority(Thread.MAX_PRIORITY);        //10

        t1.start();
        t2.start();
    }
}

/*Thread priority = number(1-10)
 * Higher priority means thread gets more chance to run (but depends on CPU scheduler).
 */