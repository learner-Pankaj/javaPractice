public class MatrixSum {
    public static void main(String[] args) {
        int arr[][] = {
                        {1,2}, 
                        {3,4}
                    };

        int arr1[][] = {
                        {5,6},
                        {7,8}
                    };
        int sum[][] = new int[2][2];
        
        //adding 2 matrix
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                sum[i][j] = arr[i][j]+arr1[i][j];
            }
        }

        //print sum matrix
        for(int i=0; i<sum.length; i++){
            for(int j=0; j<sum.length; j++){
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
