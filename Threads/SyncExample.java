//Shared resource 
class Counter {
    int count = 0;

    //synchronized -> only one thread can access at a time
    public synchronized void increment() {
        count++;
    }
}

public class SyncExample {
    public static void main(String[] args) {
        Counter c = new Counter();

        //Thread 1
        Thread t1 = new Thread(() -> {
            for(int i =0; i<1000; i++) {
                c.increment();
            }
        });

        //Thread 2
        Thread t2 = new Thread(() -> {
            for(int i =0; i< 1000; i++) {
                c.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {}

        System.out.println("Final Count = " + c.count);
    }
}

/* Without synchonized, multiple threads may change value wrongly.
 * synchronized ensures only one thread updates at a time.
 * For ex: In a bank , withdrawal is done by two 2 at the same time , so it ensures only one thread can access at a time.
 * It prevents multiple threads from accessing shared data at the same time(avoids wrong results).
 */