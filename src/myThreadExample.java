class MyThread extends Thread {
    private String threadName;

    MyThread(String name) {
        threadName = name;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(threadName + " - Count: " + i);
                // Sleep for 1 second
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " interrupted.");
        }
        System.out.println(threadName + " exiting.");
    }
}

public class myThreadExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");

        thread1.start();
        thread2.start();
    }
}
