package others;

public class Print_table {
	
	static int count=0;
	public static void tableOf(int a,int till) 
	{
		count++;
		 while(count<=till)
		 {
			 System.out.println(a+" * "+count+" = "+a*count);
			 tableOf(a,till);
		 }
	}

	public static void main(String[] args) 
	{
		tableOf(2,5);
	}

}
