package Thinkitive;

import java.util.Arrays;

public class ARRAY_lowest_value 
{
	public static void main(String[] args) 
	{
		int a[]={65,45,6,8};
		int temp;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Lowest value from array is: "+a[0]);
	}
}
