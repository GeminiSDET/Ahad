package OctJavaProgram;

import java.util.Scanner;

public class LargestThreeNumbersSecondApproach {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Fist number :");
		int a=sc.nextInt();
		System.out.println("Enter Second number :");
		int b=sc.nextInt();
		System.out.println("Enter Third number :");
		int c=sc.nextInt();
		
		int largest=a>b?a:b;
		largest = c>largest?c:largest;
		
		System.out.println("Largest is:" +largest);
	}

}
