package Inheritance;

public class childInheritance extends ParentInheritance {
	
	
	public void engine()
	{
		System.out.println("new engine");
	}
	public void colour()
	{
		System.out.println(colour);
	}

	public static void main(String[] args) {

		childInheritance ci = new childInheritance();
		ci.colour();
		ci.brakes();
	}

}
