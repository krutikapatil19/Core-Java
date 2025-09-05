class MyThreadJoin extends Thread {
    public void run() {
        for(int i = 1; i<= 3; i++) {
            System.out.println("Child Thread:" + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}

public class JoinExample {
    public static void main(String[] args) {
        MyThreadJoin t = new MyThreadJoin();
        t.start();

        try {
            t.join();                   //main thread waits until child finishes
        } catch (Exception e) {}

        System.out.println("Main thread after child is done");
    }
}


/* join() makes one thread wait for another.
 * Here, main waits until child thread finishes.
 */