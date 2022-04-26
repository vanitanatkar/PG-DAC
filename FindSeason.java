package hackerRank.com;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
public class FindSeason {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month:");
		int ch=sc.nextInt();
		switch(ch){
		case 3:
		case 4:
		case 5:
			System.out.println("Spring");
			break;
			
		case 6:
		case 7:
		case 8:
			System.out.println("Summer");
			break;
			
		case 9:
		case 10:
		case 11:
			System.out.println("Autumn");
			break;
			
		case 1:
		case 2:
		case 12:
			System.out.println("Winter");
			break;
			
			default:
				System.out.println("Invalid Month:");
		}
		
	}

}
