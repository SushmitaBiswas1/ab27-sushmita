package string_function;

import java.util.Date;

public class Current_Time {

	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime());
		System.out.println(d2);
		Date d3=new Date(d1.getTime()+1000*60*60*24*1); //to print the future date
		System.out.println(d3);
		Date d4=new Date(d1.getTime()-1000*60*60*24*5); //to print the past date
		System.out.println(d4);
		String mydate=d2.toString(); 
		System.out.println(mydate);
		String myday= mydate.substring(0,3);
		System.out.println(myday);
		String mymonth= mydate.substring(4,7);
		System.out.println(mymonth);
		String date= mydate.substring(8,10);
		System.out.println(date);
		String mytime=mydate.substring(11,19);
		System.out.println(mytime);
		String standard=mydate.substring(20,23);
		System.out.println(standard);
		String myyear=mydate.substring(24);
		System.out.println(myyear);
		
		
	

	}

}