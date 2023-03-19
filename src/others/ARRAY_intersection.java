package others;

import java.util.Arrays;
import java.util.HashSet;

public class ARRAY_intersection {
	
	public static void main(String[] args)
    {
        String[] inputArray1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
  
        String[] inputArray2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
  
        HashSet<String> set1 = new HashSet<String>(Arrays.asList(inputArray1));
         
        HashSet<String> set2 = new HashSet<String>(Arrays.asList(inputArray2));
  
        set1.retainAll(set2);
   
        System.out.println("First Array : "+Arrays.toString(inputArray1));
         
        System.out.println("Second Array : "+Arrays.toString(inputArray2));
         
        System.out.println("Common Elements : "+set1);     
    }

}
