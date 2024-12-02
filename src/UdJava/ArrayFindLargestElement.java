package UdJava;

import java.util.Scanner;

public class ArrayFindLargestElement {

	public static void main(String[] args) {
		
		int A[]= {1,3,5,7,9,43,45,777,3,2,55};
		int max1,max2;
		
		max1=max2=A[0];
		
		for(int i=0;i<A.length;i++)
		{
			if(A[i]>max1)
			{
				max2=max1;
				max1=A[i];
			}
			else if(A[i]>max2)
			{
				max2=A[i];
			}
		}
		System.out.println("Second Larget is: "+max2);
	}

}
