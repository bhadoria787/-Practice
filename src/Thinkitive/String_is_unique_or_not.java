package Thinkitive;

public class String_is_unique_or_not 
{
   static boolean uniqueCharacters(String str) 
    { 
       
        for (int i = 0; i < str.length(); i++) 
        {
            for (int j = i + 1; j < str.length(); j++) 
            {
                if (str.charAt(i) == str.charAt(j)) 
                    return false; 
            }
        }
        return true; 
    } 
  
    public static void main(String args[]) 
    {
        String input = "Geksfor"; 
  
        if (uniqueCharacters(input)) 
            System.out.println("The String " + input + " has all unique characters"); 
        else
            System.out.println("The String " + input + " has duplicate characters"); 
    }

}
