package Thinkitive;

public class STRING_all_combination_of_string 
{
	static void combine(String istr, StringBuffer otstr, int idx)
	{
		
	    for (int i = idx; i < istr.length(); i++)
	    {
	        otstr.append(istr.charAt(i));
	        System.out.println(otstr);
	        combine(istr, otstr, i + 1);
	        //System.out.println("before delete "+i+": "+otstr);
	        otstr.deleteCharAt(otstr.length() - 1);
	    }
	} 


	public static void main(String[] args) 
	{
		String s="java";
		combine(s,new StringBuffer(),0);
	}
}
