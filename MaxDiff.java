import java.util.Scanner;
class MaxDiff{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int a[]={1,2,3,5};
        int n=a.length;
        int maxDiff=0;
        int i,j;
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if(a[j]-a[i]>maxDiff)
                    maxDiff=a[j]-a[i];
            }
        }
        System.out.println(maxDiff);
        sc.close();
    }
}