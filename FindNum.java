class FindNum{
	public static void main(String[] args) {
		int arr[] = {1,2,4,5,6,7};
		int n=arr.length;
		int x = arr[0];
		for(int i=0;i<n;i++){
			if(arr[i]==x){
				x++;
				continue;
			}
			else{
				System.out.println(x + " is missing Number");
				break;
			}
		}
	}
}