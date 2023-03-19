package Ameya_infotech_programs;

public class Array_indexoutofbond_ex {

	public static void main(String[] args) {
		
		try 
		{
			int a[]=new int[3];
			a[4]=23;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("abnormal behaviour handled");
			e.printStackTrace();
		}
		System.out.println("continue coding!!!!");

	}

}
