package idz_digital;

public class A2b1c6d4 {

	public static void main(String[] args) 
	{
		String str="a2b1c5d7";
		
	    for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);

			if(Character.isDigit(ch))
			{   
				int num=Character.getNumericValue(ch);
				
				for(int j=1;j<=num;j++)
				{
					System.out.print(str.charAt(i-1));
				}
			}
		}
			
	}
	
}
