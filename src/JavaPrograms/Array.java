package JavaPrograms;

public class Array {

	public static void main(String[] args) {

		/*int a[]= new int [5]; //declares an array and allocates memory for the values
		a[0]=2;
		a[1]=3;
		a[2]=6;
		a[3]=8;
		a[4]=9;*/
		
		int a[]= {1,4,6,7,9}; //This can be used rather then the above step
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}