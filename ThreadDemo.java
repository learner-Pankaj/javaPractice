//java class thread example by extending Thread class
class MultiThread extends Thread{
    public void run(){
        System.out.println("this is multithreading program.");
    }
}

//main class
public class ThreadDemo{
    public static void main(String[] args) {
        MultiThread obj = new MultiThread();
        obj.start();
    }
}