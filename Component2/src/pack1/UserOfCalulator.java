package pack1;
import Study.FeaturesList;
import Study.MyCalculator;
public class UserOfCalulator {
	public static void main(String[] args) {
		doSum(new MyCalculator());
		doDivision(new MyCalculator());
		
	}

public static void doSum(FeaturesList obj) {
		
		System.out.println("Sum="+obj.add(3.2,4.5));
	}

public static void doDivision(FeaturesList obj) {
	
	System.out.println("Sum="+obj.divide(8,4));
}
}
