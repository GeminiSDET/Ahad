package UdJava;

public class ArraySum {

	public static void main(String[] args) {


		int A[]= {1,2,3,5,6,78,7,8,90,99,9};
		
		int sum=0;
		
		for(int x:A)
		{
			sum=sum+x;
		}
		System.out.println("Sum is: " + sum);

	}

}
