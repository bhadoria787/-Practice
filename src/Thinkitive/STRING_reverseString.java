package Thinkitive;

public class STRING_reverseString 
{
	public  static String reverseString(String str)
	{
		String s="";
		char arr[]=str.toCharArray();
		for (int i = arr.length-1; i>=0;  i--) 
		{
			s=s+arr[i];
		}
		return s;
	}
      
    public static void main (String[] args)  
    { 
      String str=reverseString("shubham");
      System.out.println(str);
    }
} 
