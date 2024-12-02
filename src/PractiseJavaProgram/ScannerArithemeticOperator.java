package PractiseJavaProgram;
import java.util.*;
public class ScannerArithemeticOperator {
/*
Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24

Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	
		System.out.print("Input first number: ");
		int num1 = sc.nextInt();
	
		System.out.print("Input second number: ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		int difference = num1 - num2;
		int product = num1 * num2;
		int quotient = num1 / num2;
		int reminder = num1 % num2;
		
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + difference);
		System.out.println("Product: " + product);
		System.out.println("Quotient: " + quotient);
		System.out.println("Reminder: " + reminder);
		
		sc.close();

		
		
	}

}