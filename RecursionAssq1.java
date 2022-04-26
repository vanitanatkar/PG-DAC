
public class RecursionAssq1 {
	
	public static void main(String[] args) {
		fun(0);

	}

	public static void fun(int i)
	{
	
		for(int j=1;j<i+1;j++)
		{
			System.out.print(""+j);
			
			
		} 
		 System.out.println("");
		 
	    if(i<5)
		{
			fun(1+i);
		}

	}     
		
	

}
