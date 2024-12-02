package OctJavaProgram;

import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) {


		int n,i,sum=0;
		System.out.println("Enter range");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		if(n%2==0)
		{
			for(i=0;i<=n;i=i+2)
			{
				sum=sum+i;
			}
			System.out.println("Sum of Even " + sum);
		}
		else
		{
			for(i=0;i<=n;i=i+2)
			{
				sum=sum+i;
			}
			System.out.println("Sum of Odd " + sum);

		}
	}

}
