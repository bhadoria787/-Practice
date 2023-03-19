package idz_digital;

public class Count_mangos_from_bucket 
{
	
	public static int countmangos(int index)
	{
		int count=0;
		for(int i=0;i<=index;i++)
		{
		if(i%2!=0)
		{
			count+=1;
		}
		else
		{
			count+=2;
		}
		}
		return count;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(countmangos(6));
	}
}
