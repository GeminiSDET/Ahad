package UdJava;

public class ArraySumElements {

	public static void main(String[] args) {


		int A[]= {3,4,4,5,6,7,78,9,79};
		int sum=0;
		
		for (int i=0;i<A.length;i++)
		{
			sum=sum+A[i];
		}
		System.out.println("Sum of: " + sum);
	}

}
