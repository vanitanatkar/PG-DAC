package Study.Exception;

public class WrongDayException extends RuntimeException {
	
public WrongDayException() {
					super("Please enter date between 1 and 31 only");
			}
	}

