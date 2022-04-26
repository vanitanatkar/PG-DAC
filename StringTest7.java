package Study;

import util.maths.Calculator; //it add full name of class(util.maths.Calculator)
//import is not compulsory

public class StringTest7 {
	
	public static void main(String[] args) {
		
	//without using import
	int res1=util.maths.Calculator.add(10,20);
	System.out.println(res1);
	
	//with using import
	int res2=Calculator.add(10,20);
	System.out.println(res2);

}

	
	
	
  
	
}
	


