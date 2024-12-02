package GFG;

public class SubsetArrayProductLessThanInteger {

	public static int countSubsets(int[] arr,int n,int k) {
		int count=0;
		int totalSubsets =(1<<n);
		
		for(int mask=1;mask<totalSubsets;mask++) {
			int product=1;
			boolean validSubset=true;
			
			for(int i=0;i<n;i++) {
				if ((mask & (1 << i ))!=0) {
					product *=arr[i];
					if (product > k) {
						validSubset = false;
						break;
					}
				}
			}
			
			if (validSubset) {
				count++;
			}
		}

		return count;
		
	}
	

	public static void main(String[] args) {
		int[] arr= {2,4,5,3};
		int n = arr.length;
		int k=12;
		
		int result = countSubsets(arr,n,k);
		System.out.println(result);

	}

}
