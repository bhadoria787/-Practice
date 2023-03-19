package Thinkitive;

public class STRING_palindrome_or_not 
{
	public static void ispalindrome(String str) 
	{
		char arr[] = str.toCharArray();
		int size = arr.length;
		char revarr[] = new char[size];
		int count = 0;
		int j=0;
		
		for (int i = size - 1; i >= 0; i--) //To reverse string
		{
			revarr[j] = arr[i];
			j++;
		}

		for (j = 0; j < size; j++) //To count similar no of character
		{
			if (arr[j] != revarr[j]) 
			{
				++count;
			}
		}
		
		if (count == size) 
		{
			System.out.println("string is planidrome");
		} else 
		{
			System.out.println("string is not aplanidrome");
		}
	}
	
	public static void PalindromeOrNot(String str)// Another way using string equalsIgnoreCase function
	{
		String revs = "";
		char arr[] = str.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) //To reverse string
		{
			revs = revs + arr[i];
		}
		
		if (revs.equalsIgnoreCase(str)) 
		{
			System.out.println("second method: string is planidrome");
		} else 
		{
			System.out.println("second method: string is not aplanidrome");
		}
	}

	public static void main(String[] args) 
	{
		ispalindrome("makookam");
		PalindromeOrNot("makookam");
		
	}
}

