package UdJava;

public class MethodStudent {

	public int roll;
	public String name;
	public String course;
	public int m1,m2,m3;
	
	public int total()
	{
		return m1+m2+m3;
	}
	
	public float avg()
	{
		return (float)total()/3;
	}
	
	public char grade()
	{
		if(avg()>60)
			return 'A';
		else
			return 'B';
	}
	
	public String toString()
	{
		return "Roll No:"+roll+"\n"+"Name:"+name+"\n"+"Course:"+course+"\n";
	}

	public static void main(String[] args) {

		MethodStudent s=new MethodStudent();
		
		s.roll=1;
		s.name="Azar";
		s.course="CS";
		s.m1=70;
		s.m2=60;
		s.m3=80;
		
		
		System.out.println("Total :"+ s.total());
		System.out.println("Average :"+ s.avg());
		
		System.out.println("Details:\n" + s);
	}

}
