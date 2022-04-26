package Study;

public class TestWrapperClass {
	public static void main(String[] args) {

		
	  byte x= 88;  
     //to print range of Data type
	System.out.println(Long.MIN_VALUE+" to "+Long.MAX_VALUE);
	System.out.println(Short.MIN_VALUE+" to "+Short.MAX_VALUE);
	System.out.println(Integer.MIN_VALUE+" to "+Integer.MAX_VALUE);
	System.out.println(Byte.MIN_VALUE+" to "+Byte.MAX_VALUE);

		 //Parse a data type from String =to covert String input to Integer :
		String s1="12";
		String s2="13";
		int sum=Integer.parseInt(s1)+Integer.parseInt(s2);
		System.out.println(sum);
      //for 12.25 or 13.2 use DoubleparseDouble

     //Character Wrapper class has useful methods like  isLetter , isDigit.
		boolean ans = Character.isDigit('2');
		System.out.println(ans);
		 ans = Character.isDigit('L');
		System.out.println(ans);

		ans = Character.isLetter('3');
		System.out.println(ans);
		ans = Character.isLetter('P');
		System.out.println(ans); 
		
		//AUTOBOXING
		Integer int1 = new Integer(23); 
		Double int2 = new Double(23.45);

		//UNBOXING
		int y =int1.intValue();
		int square =y*y;
		System.out.println(square);
		double d1=int1.doubleValue();
		System.out.println(d1);


		Integer int3= 23;   //AUTOBOXING ..internally new Integer(23)

		square = int3*int3; //AUTOUNBOXING.. internally  i2.intValue

		Long l = 15000L; //this is an object ...at heap memory



	}
}