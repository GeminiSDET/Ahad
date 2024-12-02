package GFG;

import java.util.ArrayList;

public class SubarrayWithTargetSumBruteForce {

	static ArrayList<Integer> subArraySum(int[] arr,int n,int target){
		ArrayList<Integer> outputList = new ArrayList <>();
		int i=0;
		int sum=0;
		
		for(int j=0;j<n;j++) {
			
			sum+= arr[j];
			
			while(sum>target && i<=j) {
				sum -= arr[i];
				i++	;
			}
			if(sum == target) {
				outputList.add(i+1);
				outputList.add(j+1);
				return outputList;
			}
		}
		outputList.add(-1);
		return outputList;
	}
	
	public static void main(String[] args) {

		int[] arr = {1,2,3,7,5};
		int target =12;
		
		ArrayList<Integer> result =subArraySum(arr,arr.length,target);
		System.out.println("Output" + result);
	}
	

}
