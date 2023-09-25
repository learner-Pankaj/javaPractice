public class GetThreadName extends Thread{
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(t.getName());
        t.setName("MyThread");
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        System.out.println("putting main thread into block state");
        try{
            System.out.println(Thread.activeCount());
            Thread.currentThread().join(3000);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("this statement will execute once join time will end");
    }
}
