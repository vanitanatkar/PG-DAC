package Study;

import java.util.Scanner;
public class StringTest3 {
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("***WEL-COME***");

		while(true)
		{
			System.out.println("__________________________");
			menu();
			System.out.println("Enter your choice:");
			int choice=sc.nextInt();
			if(choice>3) {break;}

			switch(choice)
			{
			case 1:
				lengthOfStr(sc);
			case 2:
				subString(sc);
			case 3:
				palindrome(sc);
			case 4:
				break;

			}

		}

	}

	public static void menu()
	{
		System.out.println("1. Show the length of string");
		System.out.println("2. Show substring");
		System.out.println("3. Check if string is palindrome");
		System.out.println("4. quit");

	}

	public static void lengthOfStr(Scanner sc)
	{
		System.out.println("Enter a String:");
		String s1=sc.next();
		int length=s1.length();
		System.out.println("Length of the String is: "+length);

	}

	public static void subString(Scanner sc)
	{
		System.out.println("Enter a String:");
		String s2=sc.next();
		System.out.println("Enter begin index:");
		int begin=sc.nextInt();
		System.out.println("Enter end index:");
		int end=sc.nextInt();
		String substr=s2.substring(begin,end);
		System.out.println("Substring is "+substr);

	}

	public static void palindrome(Scanner sc)
	{

		String str, rev = "";
		System.out.println("Enter a string:");
		str = sc.next();

		int length = str.length();

		for ( int i = length - 1; i >= 0; i-- )
			rev = rev + str.charAt(i);

		if (str.equals(rev))
			System.out.println(str+" is a palindrome");
		else
			System.out.println(str+" is not a palindrome");

	}

}


