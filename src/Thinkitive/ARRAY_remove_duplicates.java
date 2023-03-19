package Thinkitive;

import java.util.Arrays;

public class ARRAY_remove_duplicates {

	static int[] unique_array(int[] my_array)
    {
         
        int no_unique_elements = my_array.length;
         
        for (int i = 0; i < no_unique_elements; i++) 
        {
            for (int j = i+1; j < no_unique_elements; j++)
            {
                if(my_array[i] == my_array[j])
                { 
                    my_array[j] = my_array[no_unique_elements-1];
                     
                    no_unique_elements--;
                     
                    j--;
                }
            }
        }
        
        //Copying only unique elements of my_array into array1
       int[] array1 = Arrays.copyOf(my_array, no_unique_elements);

       return array1;
    }
     
    public static void main(String[] args) 
    {        
        int a[]=unique_array(new int[] {0, 3, -2, 4, 3, 2});
        System.out.println(Arrays.toString(a));
        
        int b[]=unique_array(new int[] {10, 22, 10, 20, 11, 22});
        System.out.println(Arrays.toString(b));
      }    
}

