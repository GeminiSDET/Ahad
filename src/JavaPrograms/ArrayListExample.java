package JavaPrograms;

import java.util.ArrayList;

public class ArrayListExample {

	//Array is having fixed value
	//ArrayList can grow dynamically
	
	public static void main(String[] args) {

		ArrayList<Integer> a =new ArrayList<Integer>();
		a.add(1);
		a.add(34);
		System.out.println(a);
		a.add(0,45);
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		a.get(1);
		System.out.println(a.get(1));
		System.out.println(a.contains(45));	
		System.out.println(a.indexOf(45));
		System.out.println(a.isEmpty());
		a.add(566);
		a.add(90);
		a.add(789);
		System.out.println(a);
		System.out.println(a.size());
		a.add(1, 345);
		System.out.println(a);
		a.add(345); //duplicate can be added [ArrayList,LinkedList,Vector-Implementing List Interface]
		System.out.println(a);
	}
}
