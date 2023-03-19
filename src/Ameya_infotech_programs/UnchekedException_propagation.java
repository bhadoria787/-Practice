package Ameya_infotech_programs;

public class UnchekedException_propagation {

	//Rule: By default Unchecked Exceptions are forwarded in calling chain (propagated).
	//Rule: By default, Checked Exceptions are not forwarded in calling chain (propagated).
	 void m(){  
		    int data=50/0;  
		  }  
		  void n(){  
		    m();  
		  }  
		  void p(){  
		   try{  
		    n();  
		   }catch(Exception e){System.out.println("exception handled");}  
		  }  
		  public static void main(String args[]){  
		   UnchekedException_propagation obj=new UnchekedException_propagation();  
		   obj.p();  
		   System.out.println("normal flow..."); 
		   obj.n();
		   System.out.println("normal flow...");  
		  }  
}
