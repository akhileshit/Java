// Remove "synchronized" keyword to see the inconsistent result

public class SynchronizationEx { // Synchronized method
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Create multiple threads that call the increment method
        Thread t1 = new Thread(() -> {  // Functional Interface!!
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();  // Main Thread waits until t1 and t2 completely executes
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}

// Class to keep track of count
class Counter {
    private int count = 0;

    public synchronized void increment() { // Remove "synchronized" to see the inconsistent result
        count++;
    }

    public int getCount() {
        return count;
    }
}
