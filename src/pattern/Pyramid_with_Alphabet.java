package pattern;

public class Pyramid_with_Alphabet {
	public static void main(String[] args) {
		int alphabet;
		for (int i = 1; i <=4; i++) 
		{
			alphabet=65+i;
			for (int j = 1; j <=7; j++) 
			{
				if (j>=5-i && j<=3+i) 
				{
					if(j<=4)
						alphabet--;
					else
						alphabet++;
					
					System.out.print((char)alphabet);
					
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
