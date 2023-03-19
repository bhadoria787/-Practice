package Ameya_infotech_programs;

import java.util.Scanner;

public class Reverse_String_without_loop {

	public static void reverseString(String string,int length)
	{	
		char[] ch=string.toCharArray();
		if(length>0)
		{
			System.out.print(ch[--length]);
			reverseString(string,length);
		}
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String:");
		String str=sc.nextLine();
		int length=str.length();
		reverseString(str,length);
	}

}
