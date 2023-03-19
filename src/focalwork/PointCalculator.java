package focalwork;
import java.util.*;
public class PointCalculator 
{
	public static int CountPoint(String cans,String uans) 
	{ 
		String a[]=cans.split("\\s"); 
		String b[]=uans.split("\\s");
		int point=0; 
		
		for (int i = 0; i < a.length; i++) 
		{ 
			for (int j = 0; j <b.length; j++) 
			{   int count=0;
				if(a[i].equalsIgnoreCase(b[j]))
				{ 
					
					if (b[j].length()>5)
					{
						char no[]=b[j].toCharArray();
						
						for(char c : no)             // foreach loop to check
					      {
						    if(Character.isDigit(c)) // each character of substring
						    ++count;                  
					      }                         // is integer or not
						
						if(count==no.length-1)     
						++point;
						else
							
						point+=5;
					}

					if (b[j].length()>3&&b[j].length()<=5) 
					{
						char no[]=b[j].toCharArray();
						
						for(char c : no)
					      {
						    if(Character.isDigit(c)) 
						    ++count;
					      }
						
						if(count==no.length-1)
						++point;
						else
							
						point+=3;
					}

					if (b[j].length()<=3) 
					{
						char no[]=b[j].toCharArray();
						
						for(char c : no)
					      {
						    if(Character.isDigit(c)) 
						    ++count;
					      }
						
						if(count==no.length)
						point+=1;
						else
						
						point+=2;
					}
				} 
			}
		}return point;
	}  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String CorrectSrt = "welcome to the coding center 07";
		
		System.out.println("Enter your answer: ");
		String UserSrt =sc.nextLine();
		int score=PointCalculator.CountPoint(CorrectSrt, UserSrt);
       System.out.println("point scored are: " + score);

	}
}
