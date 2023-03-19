package idz_digital;

public class Series_7_10_8_11 {
	public static void main(String[] args) 
	{
		int k=9;
		for(int i=1;i<=4;i++)
		{
			if(i%2==0)
			{
				k+=3;
				System.out.print(k+" ");
			}
			else
			{
				k-=2;
				System.out.print(k+" ");
			}
		}
	}
	

}
