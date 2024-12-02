package UdJava;

public class ArraySortString {

	public static void main(String[] args) {

		String arr[]= {"java","python","pascal","Charles","junit","Jmeter"};
		
		java.util.Arrays.sort(arr);
		
		for(String x:arr)
			System.out.println(x);
	}

}
