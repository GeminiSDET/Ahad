package PractiseJavaProgram;
import java.util.*;
public class ScannerMultiplyNumbers {
/*
 Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
 */
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Input first number
	        System.out.print("Input first number: ");
	        int num1 = input.nextInt();

	        // Input second number
	        System.out.print("Input second number: ");
	        int num2 = input.nextInt();

	        // Calculate the product
	        int product = num1 * num2;

	        // Display the product
	        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
	        
	        // Close the scanner
	        input.close();
	    }
	}








