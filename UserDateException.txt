package Study.Exception;

import java.util.Scanner;

public class UserForDate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	   MyDate2 date=new MyDate2();
		
		System.out.println("Enter day:");
		int day=sc.nextInt();
		System.out.println("Enter Month:");
		int month=sc.nextInt();
		System.out.println("Enter year:");
		int year=sc.nextInt();
		
		try {
			date.setDay(day);
		}catch(WrongDayException ed) {
			System.out.println(ed);
		}
		try {
			date.setMonth(month);
			
		}catch(WrongMonthException em)
		{
			System.out.println(em);
		}
		
		MyDate2 d=new MyDate2(32,12,2021);
		System.out.println(d);
	}

}
