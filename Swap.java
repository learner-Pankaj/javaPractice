public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Original Value: a="+a+", b="+b);
        a = a+b;    //30
        b = a-b;    //10
        a = a-b;    //20

        System.out.println("Swapped Value: a="+a+", b="+b);


    }
    
}
