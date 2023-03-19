package proteus_technologies;

public class String_to_int 
{
	public static int convertStringToInt(String inputString) 
	{
		int i = 0;
		int number = 0;
		boolean isNegative = false;
		int len = inputString.length();

		if (inputString.charAt(0) == '-') 
		{
			isNegative = true;
			i = 1;
		}
		
		while (i < len) 
		{
			number *= 10;
			number += (inputString.charAt(i++)-'0');
		}
		
		if (isNegative)
		{
			number = -number;
		}
		return number;
	}

	public static void main(String[] args) 
	{
		int a=String_to_int.convertStringToInt("-2035");
		System.out.println(a+10);
	}

}
