public class SleepExample {
    public static void main(String[] args) {
        for(int i =1; i <= 3; i++) {
            System.out.println("Number:" + i);
            try {
                Thread.sleep(1000);             //pause for 1 sec
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

/* sleep(ms) pauses thread for given time.
Useful when we want delay(e.g. animations, timers) */