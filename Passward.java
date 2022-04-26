package Study;
import java.util.Scanner;
public class Passward {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<5;i++)
	{
		System.out.println("Enter your password: ");
		String password = sc.next();
		boolean result = verify(password);
		if(result)
		{
			System.out.println("Congrats!!!");
			break;
		}
		else
		{
			System.out.println("Try again!!");
		}

	}

	sc.close();

}

	public static boolean verify(String str)
	{
		int len = str.length();
		boolean firstchar = Character.isLetter(str.charAt(0));
		boolean uppercase = false;
		boolean digit = false;
		boolean specialcharacter = false;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(0)))
			{
				uppercase = true;
			}
			if(Character.isDigit(str.charAt(i)))
			{
				digit = true;
			}
			//95=>_  45=>-  35=># 36=> $
			if(str.charAt(i) == 35 || str.charAt(i) == 36 || str.charAt(i) == 45 || str.charAt(i) == 95)
			{
				specialcharacter = true;
			}


		}
		if((len >= 8 && len<=20) && firstchar && uppercase && digit && specialcharacter )
		{
			return true;
		}
		return false;
	}
}
