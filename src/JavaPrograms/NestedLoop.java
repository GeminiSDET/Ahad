package JavaPrograms;

public class NestedLoop {

	public static void main(String[] args) {
//nested loop
		int k = 1;
		for (int i = 0; i <= 4; i++) // outer loop-this will loop for 4 times
		{
//System.out.println("outer loop started");

			for (int j = 1; j <= 4 - i; j++) // inner loop
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
	}
}
