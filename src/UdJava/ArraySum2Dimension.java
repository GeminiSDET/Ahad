package UdJava;

public class ArraySum2Dimension {

	public static void main(String[] args) {

		int A[][]= {{1,2,4},{4,6,8},{8,9,3}};
		int B[][]= {{1,4,6},{3,5,7},{3,2,5}};
		
		int C[][]=new int[3][3];
		
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[0].length;j++)
			{
				C[i][j]=A[i][j]+B[i][j];
			}
		}
		for(int x[]:C)
		{
			for (int y:x)
			{
				System.out.print(y+ " ");
			}
			System.out.println(" ");
		}
	}

}
