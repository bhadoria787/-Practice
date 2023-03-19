package Thinkitive;

import java.util.Arrays;
import java.util.Scanner;

public class STRING_max_occuring_char {

	static String maxOccuringChar(String str) 
	{

		int count[] = new int[256];
		int max = 0;
		char character = ' ';
		String stfd = "thinkitive";
		int counting[] = new int[256];
		for (int i = 0; i < stfd.length(); i++)
		{
			//System.out.println("str.charAt(i): "+stfd.charAt(i));
			counting[stfd.charAt(i)]++;//to store count of each letter of string
		}
		for (int i = 0; i < stfd.length(); i++)
		{
			System.out.println(stfd.charAt(i)+":  "+counting[stfd.charAt(i)]);
		}
		
		
		for (int i = 0; i < str.length(); i++)
		{
			//System.out.println("str.charAt(i): "+str.charAt(i));
			count[str.charAt(i)]++;//to store count of each letter of string
		}
		
		for (int i = 0; i < str.length(); i++) 
		{
			if (max < count[str.charAt(i)]) 
			{
				max = count[str.charAt(i)];
				character = str.charAt(i);
			}

		}

		return "Here "+character+" is occures "+max+" time";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "shubham singh bhadoria";
		System.out.println(maxOccuringChar(str));
		
		
	}
}
