package Ameya_infotech_programs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Convert_String_to_date {
	public static void main(String[] args) {
		
		try 
		{
			String d1="12/06/1995";
			String d2="06-12-1995";
			String d3="1995.06.12";
			
			SimpleDateFormat sdf1=new SimpleDateFormat("dd/mm/yyyy");
			SimpleDateFormat sdf2=new SimpleDateFormat("mm-dd-yyyy");
			Date D1=sdf1.parse(d1);
			Date D2=sdf2.parse(d2);
			
			System.out.println(D1);
			System.out.println(D2);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
