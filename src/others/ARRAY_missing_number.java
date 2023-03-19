package others;

import java.util.Arrays;

public class ARRAY_missing_number {

    
    static int missingNumber(int[] array,int n)  
    {
    	int sum = (n * (n+1))/ 2;              // calculates sum of numbers from 1 to n
    	
        int sumofarray = 0;
        for (int i = 0; i < array.length; i++) // calculates sum of all elements of array
        {
            sumofarray = sumofarray + array[i];
        }

        return sum-sumofarray;
    }
  
    public static void main(String[] args)
    {
        
        int[] a = {1, 4, 5, 3, 2, 8, 6};
        Arrays.sort(a);
        int greatestno=a[a.length-1];
  
        System.out.println("Input Array : "+Arrays.toString(a));
         
        System.out.println("Missing Number is = "+missingNumber(a, greatestno));
    }

}
