package UdJava;

import java.util.Scanner;

public class ArrayFindElement {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int A[]= {1,3,5,6,7,9,34,35,77,44};
		
		int key;
		System.out.println("Enter a Key: ");
		
		key=sc.nextInt();
		
		for(int i=0;i<A.length;i++)
		{
			if(key==A[i])
			{
				System.out.println("Element found at:"+i);
				System.exit(0);
			}
		}
		System.out.println("Not Found");

	}

}
