package OctJavaProgram;

import java.util.Scanner;

public class SumNaturalNumber {

	public static void main(String[] args) {


		int n,sum=0;
		
		System.out.println("Enter number of term");
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		
		for (int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Add is " + sum);
	}

}
