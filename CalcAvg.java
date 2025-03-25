
import java.util.Scanner;

public class CalcAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the number in the array.");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Printing the entered value in Array.");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }

        //Largest Number in the array.
        int max = arr[0];
        for(int i=0;i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("\nLargest number in the array = "+max);

        //Average of the Array
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        int avg = sum/arr.length;
        System.out.println("Average of the array is "+ avg);
    }
}
