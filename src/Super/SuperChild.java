package Super;

public class SuperChild extends SuperParent{

	String nameChild = "QAClick";
	public void getStringdata()
	{
		System.out.println(nameChild);
		System.out.println(super.nameParent);
	}
	public void getData()
	{
		super.getData();
		System.out.println("I am a child method class");
	}
	public static void main(String[] args)
	{
		SuperChild sc= new SuperChild();
		sc.getStringdata();	
		sc.getData();
	}
}
