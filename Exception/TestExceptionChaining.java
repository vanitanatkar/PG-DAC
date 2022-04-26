package Study.Exception;

import java.io.IOException;
import java.util.Scanner;


public class TestExceptionChaining {
	public static void main(String[] args) { /*  throws NumberFormatException{
		manager();
		}*/
				try {
				manager();
				}catch(NumberFormatException ne)
				{
					System.out.println("Please enter number as string");
				}
			}
			
			public static void supervisor() 
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("enter a string");
				String s = sc.next();
				
				//throw new IOException();
			int x = Integer.parseInt(s);
				
			}

			public static void manager() throws NumberFormatException 
			{
					supervisor();
			}
		
	}
	


