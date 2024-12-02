package OctJavaProgram;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {


		int n=6;
		System.out.println("Enter any Number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		if (n%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}

}
