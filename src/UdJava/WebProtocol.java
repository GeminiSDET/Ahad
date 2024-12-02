package UdJava;

import java.util.Scanner;

public class WebProtocol {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter url: ");
		String url=sc.nextLine();
		
		String protocol=url.substring(0,url.indexOf(":"));
		
		if(protocol.equals("http"))
		{
			System.out.println("Hyper text transfer Protocol");
		}
		else if(protocol.equals("ftp")) 
		{
			System.out.println("File Transfer protocol");
		}
		else
		{
			System.out.println("Invalid");
		}
		
		String ext=url.substring(url.lastIndexOf(".")+1);
		
		if(ext.equals("com"))
		{
			System.out.println("Commercial");
		}
		else if(ext.equals("Org"))
		{
			System.out.println("Organisation");
		}
		else if (ext.equals("in"))
			System.out.println("India");
				
		
	}

}
