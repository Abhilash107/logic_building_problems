public class ThreadExample extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getId());

    }

    public static void main(String[] args) {
        ThreadExample obj = new ThreadExample();
        obj.start();
        
    }

}
