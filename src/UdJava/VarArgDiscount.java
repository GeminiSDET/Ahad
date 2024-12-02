package UdJava;

public class VarArgDiscount {

	static double sum(double ...P)
	{
		double sum=0;
		
		for(int i=0;i<P.length;i++)
			sum+=P[i];
		
		if(sum<500)
			return sum*0.10;
		else if(sum>=500 && sum<1000)
			return sum*0.20;
		else return sum*0.30;
	}
	
	public static void main(String[] args) {

		double discount1 =sum(100,150,300);
		double discount2 =sum(500,650,800);
		double discount3 =sum(1000,1050,3000);
		
		System.out.println("Discount for first set:" + discount1);
		System.out.println("Discount for second set:" + discount2);
		System.out.println("Discount for third set:" + discount3);

	}

}
