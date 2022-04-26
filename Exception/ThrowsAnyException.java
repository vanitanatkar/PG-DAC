package Study.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsAnyException {
	public static void main(String[] args) {

	}
}
class A //parent
{
	void f1() throws IOException
	{
	}
}


class B extends A    //Child B
{
	/*
	@Override
	void f1() throws Exception  //Exception Exception is not compatible with throws clause in A.f1()
	{
		System.out.println("Valid class B F1():");
	} 

	//OR
	@Override
	 void f1()   throws FileNotFoundException  // VALID For type A
	{
		
	}
	//OR
	@Override
	void f1()   //Valid for A and B
	{
		
	}
	
   //OR
	@Override
	void f1()   throws NumberFormatException  //VALID For type A
	{
		System.out.println("Valid class B NumberFormatException");
	}
*/
	//OR
	@Override
	void f1()   throws IOException  //VALID For type A
	{
			
	} 

}

/*java.lang.Object
java.lang.Throwable
java.lang.Exception //parent
java.io.IOException//child

 * 
 * java.lang.Object
java.lang.Throwable
java.lang.Exception
java.io.IOException
java.io.FileNotFoundException 
 * 
 * 
 * java.lang.Object
java.lang.Throwable
java.lang.Exception
java.lang.RuntimeException
java.lang.IllegalArgumentException
java.lang.NumberFormatException:Thrown to indicate that the application has attempted to convert a string to one of the numeric types, but that the string does not have the appropriate format.
 * 
 * 
 * 
 */

