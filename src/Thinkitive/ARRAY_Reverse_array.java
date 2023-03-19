package Thinkitive;

import java.util.Arrays;

public class ARRAY_Reverse_array {
	public static void main(String[] args) {
		int[] a = { 3, 56, 5, 4, 3, 67, 5, 3 };
		int size = a.length;
		int[] b = new int[(size)];
		

		int j = 0;
		for (int i = size - 1; i >=0; i--) 
		{
			b[j] = a[i];
			j++;
		}
		System.out.println(Arrays.toString(b));

	}

}
