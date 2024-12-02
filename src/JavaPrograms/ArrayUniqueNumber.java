package JavaPrograms;

import java.util.ArrayList;

public class ArrayUniqueNumber {

	public static void main(String[] args) {

		int a[]= {4,5,5,5,4,6,6,9,4};
		
		//Expected
		//4-repeated 3 times
		//5-repeated 3 times
		//6-repeated 2 times
		//9-repeated 1 time
		//Print unique number form list- i.e 9
		
		//Empty Array List
		
		ArrayList<Integer> al = new ArrayList<Integer>();  //1st- Container
		
		for(int i=0;i<a.length;i++)                        //2nd-add a for loop
		{
			int k=0;
			
			if(!al.contains(a[i]))                         //3rd- This will scan if its present or not
			{
				al.add(a[i]);
				k++;
				
				for (int j=i+1;j<a.length;j++)
				{
					if(a[i]== a[j])
					{
						k++;
					}
				}
				System.out.println(a[i]);
				System.out.println(k);
				if(k==1)
				System.out.println(a[i]+" is Unique Number");
			}
		}
	}
}
