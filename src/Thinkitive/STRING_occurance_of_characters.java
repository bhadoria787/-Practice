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
		// Create a map to store character frequencies
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Iterate through the string to count occurrences of each character
        for (char c : str.toCharArray()) {
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }
		System.out.println(charFrequencyMap);
	}
}
