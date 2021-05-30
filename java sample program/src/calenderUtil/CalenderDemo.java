package calenderUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CalenderDemo {
	public static void main(String ...s) {
		try {
			printDate();
		} catch( ParseException parseException) {
				System.err.println("Unable to parse date"+parseException);
		} catch(Exception e) {
			System.err.println("An internal server is occurred"+e);
		}
	}
	
	public static void printDate() throws ParseException {
		int day=3, year =1995, month = 10;
		System.out.println("String data"+String.format("%d-%d-%d", year, month, day));
		Date date = new SimpleDateFormat("yyyy-mm-dd").parse(String.format("%d-%d-%d",year,month,day));
//		Calendar calender = Calendar.getInstance();
//		calender.setTime(date); 
		
		SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week abbreviated
	    System.out.println(simpleDateformat.format(date));
	}
}
