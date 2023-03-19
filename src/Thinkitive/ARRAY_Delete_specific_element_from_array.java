package Thinkitive;

import java.util.Arrays;
import java.util.Scanner;

public class ARRAY_Delete_specific_element_from_array 
{
	public static void main(String[] args) 
	{
		int[] a = { 3, 56, 5, 4, 3, 67, 5, 3 };
		System.out.println(Arrays.toString(a));
		
		System.out.println("\nEnter no to be deleted: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int count=0;
		
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i] == num)
			{
				++count;
			} 	
		}
		
		int[] b = new int[(a.length)-count];
		
		int j = 0;
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i] != num)
			{
				b[j] = a[i];
				++j;
			} 
		}

		System.out.println(Arrays.toString(b));
	}
}
