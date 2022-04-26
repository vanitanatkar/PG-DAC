package Study.Exception;

public class TestCommandLine {
	public static void main(String[] args) {
		try{
			System.out.println("Original String:"+args[0]);
			System.out.println("Uppercase:"+args[0].toUpperCase());
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
		}
		try {
			int n=Integer.parseInt(args[1]);		
			System.out.println("Number:"+args[1]);
			System.out.println("Square = "+n*n);
		}catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(e);
		}catch( NumberFormatException ne) {
			System.out.println(ne);
		}

	}

}
