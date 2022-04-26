
package hackerRank.com;

import java.util.Scanner;

public class BillDetails {
	
	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter number of Pizza bought:"); 
	     int pizza = sc.nextInt();
	     System.out.println("Enter Number of puffs bought:");
	     int puffs=sc.nextInt();
	     System.out.println("Enter number of Cool drinks bought:");
	     int cdk=sc.nextInt();
	     
	     System.out.println("Bill details");
	     System.out.println("No of Pizza:"+pizza);
	     System.out.println("No of Puffs:"+puffs);
	     System.out.println("No of Cool drinks:"+cdk);
	     System.out.println("Total price:"+(pizza*100+puffs*20+cdk*10));
	     System.out.println("ENJOY THE SHOW!!!");
	     
	     
		
	}
	
}


