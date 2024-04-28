package Thinkitive;

import java.util.Arrays;
import java.util.Scanner;

public class STRING_max_occuring_char {

	public static char getMaxOccurringCharacter(String str) {
        // Create a map to store character frequencies
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Iterate through the string to count occurrences of each character
        for (char c : str.toCharArray()) {
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the character with the maximum frequency
        char maxChar = '\0';
        int maxFrequency = Integer.MIN_VALUE;
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        return maxChar;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "shubham singh bhadoria";
		System.out.println(getMaxOccurringCharacter(str));
		
		
	}
}
