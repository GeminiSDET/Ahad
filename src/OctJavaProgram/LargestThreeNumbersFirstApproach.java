package OctJavaProgram;

import java.util.Scanner;

public class LargestThreeNumbersFirstApproach {

	public static void main(String[] args) {

			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter Fist number :");
			int a=sc.nextInt();
			System.out.println("Enter Second number :");
			int b=sc.nextInt();
			System.out.println("Enter Third number :");
			int c=sc.nextInt();
			
			if(a>b && a>c)
			{

			System.out.println("Largest number is:" +a );
		}
			else if(b>a && b>c) {
				System.out.println("Largest number is:" +b );

			}
			else {
				System.out.println("Largest number is:" +c );

			}
	
	}
}

