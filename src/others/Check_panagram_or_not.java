package others;

public class Check_panagram_or_not {

	public static boolean checkPangram(String str) {

		// By default all the elements of
		// mark would be false.
		boolean[] mark = new boolean[26];

		// For indexing in mark[]
		int index = 0;

		for (int i = 0; i < str.length(); i++) 
		{

			if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
			{
				index = str.charAt(i) - 'A';
				System.out.println(index);
			}

			else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')
			{
				index = str.charAt(i) - 'a';
				System.out.println("Small: "+index);
			}

			else
			{
				continue;
			}
			mark[index] = true;
		}

		// Return false if any character is unmarked
		for (int i = 0; i < 26; i++)
			if (mark[i] == false)
				return (false);

		// If all characters were present
		return (true);
	}

	
	public static void main(String[] args) 
	{
		String str = "The quick brown fox jumps over the lazy dog";

		if (checkPangram(str))
			System.out.print(str + " is a pangram.");
		else
			System.out.print(str + " is not a pangram.");
	}

}
