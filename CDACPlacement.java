package hackerRank.com;

import java.util.Scanner;

 public class CDACPlacement {
   public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter No of student Placed in CSE:");
	int cse=sc.nextInt();
	System.out.println("Enter No of Student Placed in ECE:");
	int ece=sc.nextInt();
	System.out.println("Enter No of student Placed in Mech:");
	int mech=sc.nextInt();
	if(cse<0 || ece<0 || mech<0) 
		System.out.println("Input is Invalid");
	
	if(cse==ece && ece==mech) 
		System.out.println("None of the department has got the highest placement");

	
	if(cse>ece && ece>mech) 
		System.out.println("Highest placement\n CSE");
		
	if(cse<ece && ece==mech) 
		System.out.println("Highest placement\n ECE \n MECH");
	}
 }
   

