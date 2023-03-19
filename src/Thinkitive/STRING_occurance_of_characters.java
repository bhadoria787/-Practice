package Thinkitive;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class STRING_occurance_of_characters 
{
	public static void main(String[] args) 
	{
		String str = "thinkitive";

		Map<Character, Integer> countOcc = new LinkedHashMap<>();

		for (Character c : str.toCharArray()) 
		{
			if (countOcc.containsKey(c)) 
			{
				countOcc.put(c, countOcc.get(c) + 1);
			} 
			else 
			{
				countOcc.put(c, 1);
			}

		}
		System.out.println(countOcc);
	}
}
