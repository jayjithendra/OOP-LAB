class MyThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                System.out.println("Thread " + Thread.currentThread().getName() + " was interrupted.");
                return;
            }
        }
    }
}

public class PriorityCheck {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread(), "Thread 1");
        Thread thread2 = new Thread(new MyThread(), "Thread 2");

        // Set priorities
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
    }
}

