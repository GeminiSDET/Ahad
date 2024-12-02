package UdJava;

public class OverloadAreaCalculate {

	
	static double area(double radius)
	{
		return Math.PI*radius*radius;
	}
	
	static double area(double length,double breadth)
	{
		return length*breadth;
	}
	
	
	public static void main(String[] args) {

		double circleArea=area(5);
		System.out.println("Area of Circle: " + circleArea);
		
		double rectangleArea = area(4,6);
		System.out.println("Area of Rectangle: " + rectangleArea);
	}

}
