package proteus_technologies;

import java.util.Arrays;

public class Array_sumof2elements_67 {
	public static void main(String[] args) {
		int temp;  
		
		int a[]= {2,6,10,0,4,5,5};
		// find two element from array whoe's sum is 10
		
		System.out.println("Two element from array whoe's sum is 10 are:- ");
		for (int i = 0; i < a.length; i++)   
		{  
			for (int j = i + 1; j < a.length; j++)   
			{  
				
				if (a[i] + a[j]==10)   
				{  
					System.out.println(a[i]+" and "+a[j]);
				}  
				
			}  
			
		}
	
	}

}
