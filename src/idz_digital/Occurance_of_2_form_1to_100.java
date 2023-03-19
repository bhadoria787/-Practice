package idz_digital;

public class Occurance_of_2_form_1to_100 {
	
	static int number0f2s(int n)  
	{ 
	    int count = 0; 
	    while (n > 0)  
	    { 
	        if (n % 10 == 2) 
	        count++; 
	  
	        n = n / 10; 
	    } 
	    return count; 
	} 
  
	static int numberOf2sinRange(int n)  
	{ 
	      
	    // Initialize result 
	    int count = 0;  
	  
	    // Count 2's in every number  
	    // from 2 to n 
	    for (int i = 2; i <= n; i++) 
	    count += number0f2s(i); 
	  
	    return count; 
	}
	
	public static void main(String[] args) {
		System.out.println(numberOf2sinRange(10));
	}
}
