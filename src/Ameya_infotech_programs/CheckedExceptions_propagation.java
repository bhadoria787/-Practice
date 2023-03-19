package Ameya_infotech_programs;

import java.io.IOException;

public class CheckedExceptions_propagation {
	

    void m() throws IOException 
    { 
        throw new IOException("device error"); 
    } 
  
    void n() throws IOException 
    { 
        m(); 
    } 
    void p() 
    { 
        try { 
  
            n(); 
        } 
        catch (Exception e) { 
            System.out.println("exception handled"); 
        } 
    } 
	    public static void main(String args[]) 
	    { 
	    	CheckedExceptions_propagation obj = new CheckedExceptions_propagation();
	    	
	       try { obj.n();}catch(Exception e) {e.printStackTrace();} 
	       obj.p();
	        System.out.println("Normal flow..."); 
	    } 

}
