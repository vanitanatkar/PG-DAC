
import java.util.Scanner;
public class MainArray {
	
	public static void main(String[] args){
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no of student you want");
		int noOfStudent=sc.nextInt();
		
		Student Studs[] = new Student[noOfStudent];
		
		for(int i=0;i<Studs.length;i++)
		{
			String name="";
			int age=0;
			
			System.out.println("Enter name:");
			name=sc.next();
			System.out.println("Enter age");
			age=sc.nextInt();
			
			Studs[i]=new Student(name,age);
		}
			
	}
		
}
			
			
	
