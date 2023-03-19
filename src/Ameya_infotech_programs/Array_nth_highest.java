package Ameya_infotech_programs;
import java.util.*;
public class Array_nth_highest {
	public static int getNthLargest(int[] a,int total,int n){  
		int temp;  
		for (int i = 0; i < total; i++)   
		{  
			for (int j = i + 1; j < total; j++)   
			{  
				if (a[i] > a[j])   
				{  
					temp = a[i];  
					a[i] = a[j];  
					a[j] = temp;  
				}  
			}  
		}  
		return a[total-n];  
	}  
	public static void main(String args[]){  
		Scanner sc=new Scanner(System.in);
		int a[]= new int[5];
		int no_of_elements=a.length;
		System.out.println("Enter numbers:");
		for(int i=0;i<no_of_elements;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("which nth highest salary you want to see");
		int n=sc.nextInt();
		System.out.println("Third Largest: "+getNthLargest(a,no_of_elements,n));  
	}

}
