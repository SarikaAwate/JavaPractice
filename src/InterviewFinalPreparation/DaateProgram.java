package InterviewFinalPreparation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DaateProgram {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date);
	
		SimpleDateFormat format=new SimpleDateFormat("DD/MM/YYYY");
		String stringDate=format.format(date);
		System.out.println(stringDate);
		
		
		String Date1="12-April-2022";
		
		System.out.println(Date1.replaceAll("April", "4"));
		
		String str="08-04-2022";
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-DD");
		Object date12=sdf.parse(str);
	//	System.out.println(stringDate);
		//Object date12 = sdf.parse(str);
		System.out.println(date12);
	}
	
	

}
