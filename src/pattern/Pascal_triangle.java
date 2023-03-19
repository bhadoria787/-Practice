package pattern;

public class Pascal_triangle {
	public static void main(String[] args) 
	{
		int N=5;
		//Triangle pattern
		for (int i = 0; i < N; i++) 
		{
			int num=1;
			for (int j = 0; j <=i; j++) 
			{
				System.out.print(" "+num);
				num=num*(i-j)/(j+1);
			}
			System.out.println();
		}
		
		
		
		System.out.println("\n\n\n");
		//Pyramid pattern
		for (int i = 0; i < N; i++) 
		{
			int num=1;
			for (int j = 0; j <= N - i; j++)
			{
				System.out.print(" ");
			}
			for (int j = 0; j <=i; j++) 
			{
				System.out.print(" "+num);//space is mandatory for pyramid pattern
				num=num*(i-j)/(j+1);
			}
			System.out.println();
		}
		
	}

}
