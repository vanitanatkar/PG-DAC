import java.util.Scanner;

public class MainArea {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter radius");
		int radius =sc.nextInt();
			
			
		Circle c1=new Circle(radius);
		 c1.Area();
		 Circle c2=new Circle(radius);
	     c2.Circumference();
	    
	    

	}
	

	
	
}
