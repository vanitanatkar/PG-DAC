package Study.Exception;
import java.io.IOException;
import java.util.InputMismatchException;


public class ThrowExample {

	public static void main(String[] args) {

		//f1(50);
		try {
			f2(200);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}//try end

	static void f1(int x)
	{
		if( x >100) {
			InputMismatchException obj = new InputMismatchException();
			throw obj;  //this is unchecked exception
			//throw new InputMismatchException();
		}
		else
			System.out.println("reachedf1");

	}
	
	static void f2(int x) throws IOException  //compiler forces to use danger sign
	{
		if( x >100) {

			throw new IOException();
			//throw new InputMismatchException();
		}
		else
			System.out.println("reachedf2 ");

	}//main end


}
/*java.lang.Object
java.lang.Throwable
The Throwable class is the superclass of all errors and exceptions in the Java language.*/
/*java.lang.Object
java.lang.Throwable
java.lang.Exception
java.io.IOException..
Signals that an I/O exception of some sort has occurred. This class is the general class of exceptions produced by failed or interrupted I/O operations...*/

