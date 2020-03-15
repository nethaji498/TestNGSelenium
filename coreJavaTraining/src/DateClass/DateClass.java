package DateClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		
		Date d=new Date(); //Date Class from util package
		System.out.println(d.toString());
		SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(sd.format(d));
		System.out.println(sdf.format(d));
		
		

	}

}
