package UdJava;

import java.util.Scanner;

public class SwitchDIsplayNameDay {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Day Number");
		
		int day=sc.nextInt();
		
		switch(day)
		{
		case 1: System.out.println("Monday");
		break;
		
		case 2: System.out.println("Tuesday");
		break;
		
		case 3: System.out.println("Wednesday");
		break;
		
		case 4: System.out.println("Thrusday");
		break;
		
		case 5: System.out.println("Friday");
		break;
		
		case 6: System.out.println("Saterday");
		break;
		
		case 7: System.out.println("Sunday");
		break;
		
		default: System.out.println("Invalid");
		break;
		}
	}

}
