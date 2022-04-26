package Study;

import java.util.Scanner;
public class UserStudent {
	public static void main(String[] args) {

		Student_IET s1=new Student_IET();
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your name:");
		String name=sc.next();   
		//the next()= delimiter pattern. 
		//This method may block while waiting for input to scan, even if a previous invocation of hasNext returned true. 
		s1.setName(name);
		System.out.println(s1.getName()); 

		System.out.println("Enter your lastname:");
		String lastname=sc.next();
		s1.setLastname(lastname);
		System.out.println(s1.getLastname());

		System.out.println("Enter your age:");
		int age=sc.nextInt();
		s1.setAge(age);
		System.out.println(s1.getAge());


		System.out.println("Enter your Graduation_year:");
		int graduation_year=sc.nextInt();
		s1.setGraduation_year(graduation_year);
		System.out.println(s1.getGraduation_year());

		System.out.println("Enter your Graduation_stream:");
		String graduation_stream=sc.next();
		s1.setGraduation_stream(graduation_stream);
		System.out.println(s1.getGraduation_stream());


	}

}
