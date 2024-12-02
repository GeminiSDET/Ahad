package JavaPrograms;

public class ParameterizedConstructor {

		public ParameterizedConstructor()
		{
			System.out.println("I am in the constructor");
			System.out.println("I am in the constructor one");
		}
		
		public ParameterizedConstructor(int a,int b)
		{
			System.out.println("I am Para constructor");
		}
		
		public void getData()
		{
			System.out.println("I am learning");
		}

	public static void main(String[] args) {

		ParameterizedConstructor c = new ParameterizedConstructor();
		ParameterizedConstructor p = new ParameterizedConstructor(4,5);
	}
}
