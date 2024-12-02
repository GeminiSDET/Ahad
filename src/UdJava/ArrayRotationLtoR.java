package UdJava;

public class ArrayRotationLtoR {

	public static void main(String[] args) {

		//22 3 4 55 6 78 79 8 9 1 

		int A[]= {1,22,3,4,55,6,78,79,8,9};
		
		for (int x:A)
			System.out.print(x+ " ");
		    System.out.println("");
		
		int temp=A[0];
		for(int i=1;i<A.length;i++)
		{
			A[i-1]=A[i];
		}
		A[A.length-1]=temp;
		for (int x:A)
			System.out.print(x+ " ");
		    System.out.println("");
	}
}
