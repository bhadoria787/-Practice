package Thinkitive;

public class STRING_get_Longest_Substring 
{
	public static String logestSubstring(String s)	
	{
		String[] t=s.split(" ");
		String temp;
		for (int i = 0; i < t.length; i++) {
			for (int j = i+1; j < t.length; j++) {
				if(t[i].length()<t[j].length())
				{
					temp=t[i];
					t[i]=t[j];
					t[j]=temp;
				}
			}
		}
		return t[0];
	}
	
	public static void main(String[] args) 
	{
		String s=logestSubstring("my  name is shubham");
		System.out.println(s);
			
	}

}
