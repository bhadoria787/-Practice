package pattern;

public class Suqare_with_DaimondGap 
{
	public static void main(String[] args) 
	{
		int k=0;
		for (int i = 1; i <=7; i++) 
		{
			if(i<=4)
				k++;
			else
				k--;
			
			for (int j = 1; j <=7; j++) 
			{
				if(j>=6-k && j<=2+k)
				{
					System.out.print(" ");
				}
				else 
				{
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}

}
