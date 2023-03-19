package Thinkitive;

public class STRING_reverseSentence 
{
	public  static String reverseSentsnce(String str)
	{
		String s="";
		String arr[]=str.split(" ");
		for (int i = arr.length-1; i>=0;  i--) 
		{
			s=s+arr[i]+" ";
		}
		return s;
	}
      
    public static void main (String[] args)  
    { 
      String str=reverseSentsnce("my name is shubham");
      System.out.println(str);
    } 
} 