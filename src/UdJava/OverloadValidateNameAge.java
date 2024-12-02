package UdJava;

public class OverloadValidateNameAge {

	boolean validate(String name)
	{
		return name.matches("[a-zA-Z\\s]+");
	}
	
	boolean validate(int age)
	{
		return age>=3 && age<=15;
	}
	
	
	public static void main(String[] args) {

		OverloadValidateNameAge obj= new OverloadValidateNameAge();
		
		//Test name validation
		String name1="Azar Ahmed";
		String name2="Rizu Ahmed";
		
		System.out.println("Is \"" + name1 + "\" a valid name? " + obj.validate(name1));
        System.out.println("Is \"" + name2 + "\" a valid name? " + obj.validate(name2));

        // Test age validation
        int age1 = 10;
        int age2 = 20;

        System.out.println("Is " + age1 + " a valid age? " + obj.validate(age1));
        System.out.println("Is " + age2 + " a valid age? " + obj.validate(age2));
    }	

}
