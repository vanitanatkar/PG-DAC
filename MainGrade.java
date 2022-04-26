
import java.util.Scanner;
public class MainGrade{
	
	public static void main(String[] args){
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter test Score");
		int Score=sc.nextInt();
		
		if(Score>=90)
			System.out.println("Grade is A");
		else if(Score>=80)
			System.out.println("Grade is B");
		else if(Score>=70)
			System.out.println("Grade is c");
		else if(Score>=60)
			System.out.println("Grade is D");
		else if(Score>=50)
			System.out.println("Grade is E");
					
		}		
	
}