package OctJavaProgram;

import java.util.Scanner;

public class CharPrint {

	public static void main(String[] args) {


		char ch;
		System.out.println("Enter Character");
		Scanner s = new Scanner(System.in);
		ch=s.next().charAt(3);
		System.out.println(ch);
	}

}
