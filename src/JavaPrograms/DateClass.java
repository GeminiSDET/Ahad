package JavaPrograms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {

		Date d=new Date();
		
		SimpleDateFormat sdf=new SimpleDateFormat("d/M/yyyy");//Customized date format [dd/mm/yyyy]
		SimpleDateFormat shf=new SimpleDateFormat("hh:mm:ss");
		sdf.format(d);
		sdf.format(d);
		System.out.println(sdf.format(d));
		System.out.println(shf.format(d));
		//System.out.println(d.toString());
		
		
		
		
	}

}
