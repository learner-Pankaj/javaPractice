public class MyThread extends Thread {
    public void run(){
        System.out.println("MyThread is Running");
    }
    public static void main(String[] args) {
        MyThread mt  = new MyThread();
        mt.start();
    }
}
