package JavaPrograms;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		int a[][]= new int[2][3];
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=5;
		a[1][0]=3;
		a[1][1]=4;
		a[1][2]=7;
		
		//int a[][]={{2,4,5},{3,4,7}};   //This can be used rather then the above step
		
		for (int i=0;i<2;i++) //outer for loop-row
		{
			for (int j=0;j<3;j++) //inner for loop-coloumn
			    {
				System.out.println(a[i][j]);
				}
		}	
	}
}
