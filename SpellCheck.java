package hackerRank.com;

import java.util.Scanner;

public class SpellCheck {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int flag=0;
		{
		System.out.println("Enter the First letter");
			if(sc.next().charAt(0)!='R');
			  flag++;
			  
			  System.out.println("Enter the Second letter");
			 if(sc.next().charAt(0)!='A');
			  flag++;
			  
			  System.out.println("Enter the Third letter");
			if(sc.next().charAt(0)!='I');
			  flag++;
			  
			  System.out.println("Enter the Fourth letter");
			if(sc.next().charAt(0)!='N');
			  flag++;
			  
			  System.out.println("Enter the fifth letter");
			if(sc.next().charAt(0)!='B');
			  flag++;
			  
			  System.out.println("Enter the Sixth letter");
			if(sc.next().charAt(0)!='O');
			  flag++;
			  
			  System.out.println("Enter the Seventh letter");
			if(sc.next().charAt(0)!='W');
			  flag++;
		       }
			 if(flag==0)
			  System.out.println("RAINBOW");
		        else
		          System.out.println("The spelling is wrong");
		       
		}
}
	

