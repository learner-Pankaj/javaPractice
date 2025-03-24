import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number to do Sum.");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = x+y;
        System.out.println("The sum is = "+sum);
    }
}
