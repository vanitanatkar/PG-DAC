package hackerRank.com;

import java.util.Scanner;
public class NoToMonth {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Month in Number:");
		int n=sc.nextInt();
		String[] month= {"Jan", "Feb", "March", "April", "May", "June", "Jule", "August", "Sep", "Actober", "Nov", "Dec"};
		if(n>12 || n<0) 
			System.out.println("No month for the number "+n);
			else
				System.out.println(month[n-1]);
	}

}
