public class DiffTask extends Thread{
    @Override
    public void run() {
        String a = Thread.currentThread().getName();
        System.out.println("Thread name is : "+a);
    }
    public static void main(String[] args) {
        DiffTask th = new DiffTask();
        th.start();
    }
}
