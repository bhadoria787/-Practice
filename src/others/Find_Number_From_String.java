package others;

public class Find_Number_From_String 
{
	
	public static void main(String args[])
	{
	      String sample = "krishna64";
	      char[] chars = sample.toCharArray();
	      StringBuilder sb = new StringBuilder();
	      for(char c : chars)
	      {
	         if(Character.isDigit(c))
	         {
	            sb.append(c);
	         }
	      }
	      System.out.println(sb);
    }
}
