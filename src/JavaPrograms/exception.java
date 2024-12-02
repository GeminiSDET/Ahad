package JavaPrograms;

public class exception {
//Arithmetic Exception
	
	public static void main(String[] args) {

		int b=4;
		int c=0;
		try
		{
			int k=b/c;
			System.out.println(k);
		}
		catch(Exception e)
		{
			System.out.println("error captured");
		}
	}
}
