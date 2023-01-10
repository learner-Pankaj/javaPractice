import java.util.Scanner;
class SumofTwoNum{

	public static int Sum(int a, int b){
		int x = a;
		int y = b;
		return x+y;
	}

	public static void main(String[] args) {
		int a, b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println(Sum(a, b));
		sc.close();
	}
}