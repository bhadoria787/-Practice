package pattern;

public class Rectangel_with_PyramidGap {
	public static void main(String[] args) {
		
		for (int i = 1; i <=4; i++) 
		{
			for (int j = 1; j <=7; j++) 
			{
				if (j>=6-i && j<=2+i) 
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
