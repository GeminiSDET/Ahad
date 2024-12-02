package OctJavaProgram;

import java.util.Scanner;

public class NaturalNumber {

	public static void main(String[] args) {


		int n;
		System.out.println("Enter natural number");
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			System.out.println(i+ " ");
		} 
	}

}
