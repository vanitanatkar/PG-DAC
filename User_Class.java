package Study;

public class User_Class {
	public static void main(String[] args) {
		
		doSomeCalculations( new HiFiCal() );
		
	}


public static void doSomeCalculations(FeaturesList obj)
{
	System.out.println( obj.add(20,10));
	System.out.println(obj. integerDivision( 15 , 5 ));
}
}
