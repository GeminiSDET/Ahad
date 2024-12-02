package OctJavaProgram;

import java.util.Scanner;

public class OddNumRange {

	public static void main(String[] args) {


		int n;
		System.out.println("Enter number of Odd Range");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		for (int i=1;i<=n;i=i+2)
		{
			System.out.print(i + " ");
		}
		
	}

}
