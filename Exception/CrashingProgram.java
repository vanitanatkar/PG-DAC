package Study.Exception;

import java.util.Scanner;

public class CrashingProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int divident=0; int division=0;
       
		System.out.println("enter divident");
		 divident = sc.nextInt();

		System.out.println("enter divisor");
		int divisor = sc.nextInt();

		 division = divident/divisor; //i/p=0 o/p= java.lang.ArithmeticException
       
		System.out.println("LAST LINE  division ="+division);

	}

}
//2. Try the CrashingProgram and All the Handling programs by typing on your machine
////i/p=0 o/p= java.lang.ArithmeticException=Thrown when an exceptional arithmetic condition has occurred
