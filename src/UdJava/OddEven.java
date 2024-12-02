package UdJava;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {


		int n;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		n=sc.nextInt();
		if (n%2==0)
		{
			System.out.println("Number is even ");
		}
		else
		{
			System.out.println("Number is odd ");
		}
	}

}
