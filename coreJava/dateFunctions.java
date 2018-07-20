package coreJava;

import java.util.*;

public class dateFunctions {
		
		void dateExamples() {
			
			String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", 
			         "Oct", "Nov", "Dec"};
			int year;      
			
			Date date = new Date();
			String s ;
			System.out.println("Today's Date :" + date);
			System.out.println(date.toString());
			s = date.toString();
			System.out.println(s.length());
			System.out.printf("%s %tB %<te, %<tY\n", "Due date:", date);
			
			GregorianCalendar gcalendar = new GregorianCalendar();
			
			System.out.print("Date: ");
		      System.out.print(months[gcalendar.get(Calendar.MONTH)]);
		      System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
		      System.out.println(year = gcalendar.get(Calendar.YEAR));
		      System.out.print("Time: ");
		      System.out.print(gcalendar.get(Calendar.HOUR) + ":");
		      System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
		      System.out.println(gcalendar.get(Calendar.SECOND));
			
		     
		}
	
}
