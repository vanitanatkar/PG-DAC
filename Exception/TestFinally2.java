package Study.Exception;

public class TestFinally2 {
	public static void main(String[] args) {
		
		try {
		System.out.println("1");
		throw new NullPointerException();
				
		}
		catch(NullPointerException e) {
			System.out.println("2");
		}
		finally {
			System.out.println("3");
		}
		//System.out.println("5");
	}


}
//try-catch
//try-catch-catch-catch.......
//try-catch-cath-finally
//try-finally
