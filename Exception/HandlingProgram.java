package Study.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;
public class HandlingProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int divident=0; int division=0;
		try {
			System.out.println("enter divident");
			divident = sc.nextInt();

			System.out.println("enter divisor");
			int divisor = sc.nextInt();

			division = divident/divisor; //i/p=0 o/p= java.lang.ArithmeticException
		}//end try
		catch(ArithmeticException ae) {
			System.out.println(" 1 "+ae);
			division = divident/1;

		}
		catch(InputMismatchException ip)
		{
			System.out.println("2"+ip);
		}
		catch(Exception obj) {
			System.out.println("2"+obj);
		}
		System.out.println("LAST LINE  division ="+division);

	}


}/*java.lang.Object
java.lang.Throwable
java.lang.Exception
java.lang.RuntimeException
java.util.NoSuchElementException
java.util.InputMismatchException..*/
//Thrown by a Scanner to indicate that the token retrieved does not match the pattern for the expected type, or that the token is out of range for the expected type
