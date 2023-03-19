package others;

public class LeapYear 
{
	public static void isLeapYear(int year) 
	{
		boolean isleap;
		if(year%4==0)
		{
			if (year%100==0) 
			{
				if (year%400==0) 
				{isleap=true;} 
				else 
				{isleap=false;}
			} 
			else 
			{
				isleap=true;
			}
		}
		else
		{
			isleap=false;
		}
		
		if(isleap)
		{
			System.out.println(year+" is a leap year ");
		}
		else
		{
			System.out.println(year+" is not a leap year ");
		}
	}
	
	public static void main(String[] args) 
	{
		isLeapYear(2011);
	}
}
