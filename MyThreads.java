public class MyThreads implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running from runnable interface");
    }
    public static void main(String[] args) {
        MyThreads th = new MyThreads();
        Thread t1 = new Thread(th);
        t1.start();
    }
}
