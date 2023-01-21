class Even extends Thread{
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            if(i%2==0)
                System.out.println(i);
        }
    }
}

class Odd extends Thread{
    @Override
    public void run() {
        
    }
}

public class TwoThreads {
    
}
