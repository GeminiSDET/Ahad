package GFG;

import java.util.Arrays;

public class BubbleSortArray {

	public static void main(String[] args) {

		int a[]= {2,5,3,9,55,3,756,4};
		System.out.println("Array before sort:" + Arrays.toString(a));
		
		int n=a.length;
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[i]>a[j+1])
				{
					int temp=a[j];
					a[j] =a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Array after sort:" + Arrays.toString(a));
	}

}
