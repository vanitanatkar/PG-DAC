
public class RecursionPPPP {
      public static void main(String[] args) {
    	  fun(1);
    	  
	}
      
      public static void fun(int i)
      {
    		 System.out.print(i+",");
    		 
    		 if(i<100)
    		 {
    			 fun(i+1);
    		 }
    		 
    		 else	
    		 System.out.println("");
    		 System.out.print(i+",");
      }
      
      
		
}
