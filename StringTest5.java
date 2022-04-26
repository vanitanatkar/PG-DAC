package Study;
import java.util.Scanner;
public class StringTest5 {
	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.next();
		StringBuffer str=new StringBuffer(s);
		StringBuffer temp=new StringBuffer(s);

		str.reverse();

		if(temp.toString().equals(str.toString()))
			System.out.println("String is palindrome:");
		else
			System.out.println("String is not palindrome");
		
		
		

	}

}
