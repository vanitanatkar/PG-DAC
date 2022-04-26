package Study.Exception;

public class WrongMonthException extends RuntimeException {
	
	public WrongMonthException() {
	   super("Please Enter month between 1 and 12 ");
	}
 
}
