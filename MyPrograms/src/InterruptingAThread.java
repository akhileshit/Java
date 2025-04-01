
class DownloadTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Download started...");

        for (int i = 1; i <= 10; i++) {
            // Simulate time-consuming task
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Download interrupted!");
                return; // Exit the thread
            }

            System.out.println("Downloaded " + i * 10 + "%");

            // Check if the thread has been interrupted
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Download stopped by user.");
                return; // Exit the thread
            }
        }

        System.out.println("Download completed successfully.");
    }
}

public class InterruptingAThread {
    public static void main(String[] args) {
        Thread downloadThread = new Thread(new DownloadTask());
        downloadThread.start();

        // Simulate user action after 3 seconds
        try {
            Thread.sleep(1035); // Main thread sleeps for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("User decides to cancel the download.");
        downloadThread.interrupt(); // Interrupt the download thread
    }
}

// sometimes it is interrupted while sleeping...
// sometimes it is interrupted while running...