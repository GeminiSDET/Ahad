package UdJava;

public class VarArgSum {

	
	static int sum(int ...A)
	{
		int s=0;
		for(int i=0;i<A.length;i++)
			s+=A[i];
		return s;
	}
	
	
	public static void main(String[] args) {

		System.out.println("Sum of 1,2,3,4:"+ sum(1,2,3,4));
		System.out.println("Sum of no numbers:"+ sum());
		


	}

}
