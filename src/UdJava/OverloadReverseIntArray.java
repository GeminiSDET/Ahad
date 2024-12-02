package UdJava;

import java.util.Arrays;

public class OverloadReverseIntArray {

	//reversing an integer
	int reverse(int n)
	{
		int rev=0;
		while(n>0)
		{
			rev=rev*10+n%10;
			n=n/10;
		}
		return rev;
	}
	
	//reversing an array
	int [] reverse(int A[])
	{
		int B[]=new int[A.length];
		for(int i=A.length-1,j=0;i>=0;i--,j++)
			
			B[j]=A[i];
		
		return B;
	}
	
	
	public static void main(String[] args) {

		OverloadReverseIntArray obj=new OverloadReverseIntArray();
		
		//Reverse an integer
		int num=12345;
		int reverseNum=obj.reverse(num);
		
		System.out.println("Original Number:" + num);
		System.out.println("Reverse Number:" + reverseNum);
		
		
		//Reverse an Array
		int[] array= {1,2,4,5,77,89};
		int[] reverseArray=obj.reverse(array);
		
		System.out.println("Original Array:" + Arrays.toString(array));
		System.out.println("Reversed Array:" + Arrays.toString(reverseArray));
	}

}
