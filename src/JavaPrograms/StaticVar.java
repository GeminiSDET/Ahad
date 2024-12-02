package JavaPrograms;

public class StaticVar {

	
	String name; //Instance Variable
	String address; //Instance Variable
	static String city= "Bangalore"; // static [which is called as class variable] is used to get rid of writing the same city name again and again
	static int i = 0;

	StaticVar(String name, String address) {
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);

	}

	public void getAddress() {
		System.out.println(address + " " + city);
	}

	public static void getCity() {
		System.out.println(city);
	}

	public static void main(String[] args) {

		StaticVar obj = new StaticVar("Bob", "Marathalli");
		StaticVar obj1 = new StaticVar("Tom", "HSR");
		obj.getAddress();
		obj1.getAddress();
		StaticVar.getCity(); // All static method can be directly access with classname.methodname
		StaticVar.i=4;
		obj.address="Sarjapur";
	}
}
