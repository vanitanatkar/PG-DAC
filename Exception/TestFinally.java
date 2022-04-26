package Study.Exception;

public class TestFinally {
	public static void main(String[] args) {
		try {
		System.out.println("1");
				//System.out.println("2");
	    }
		catch(NullPointerException e)
		{
		System.out.println("3");
		}
		finally {
			System.out.println("4");
		}
		System.out.println("5");
	}

}
//here finallay run har hall me run hota hai...i.e 4
//here we write code in finally which we want in every situation to run that code..