class MyThread extends Thread {
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // Start the thread
    }
}
