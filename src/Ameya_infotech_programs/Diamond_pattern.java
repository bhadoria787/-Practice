package Ameya_infotech_programs;

public class Diamond_pattern {
	public static void main(String args[]) {
		int k=0;
		for(int i=1;i<=9;i++)
		{
			if(i<=5) k++; else k--;

			for(int j=1;j<=9;j++)
			{

				if(j==4+i||j==6-i||i==4+j||i==14-j)
				{
					System.out.print("1");
				}
				else if(j>=6-k&&j<=4+k)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
