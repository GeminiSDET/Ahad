package OctJavaProgram;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Azar";
		String reverse="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+ s.charAt(i);
		}
		System.out.println(reverse);	
}
}
