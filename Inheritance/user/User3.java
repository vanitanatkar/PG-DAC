package Study.Inheritance.user;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import Study.HasARelation.Book;
import Study.HasARelation.MyDate;
import Study.Inheritance.Patient;

public class User3 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
 //Create an array of Patients,Accept values from user,Print the patient name , disease desc:   
		//Print all the names of patients who are children --less than18
		System.out.println("how many patient you want to list:");
		int size=sc.nextInt();
		Patient[] p1 =new Patient[size];
		populate(p1,sc);
		System.out.println("_________________________________");
		System.out.println("Patient List:");
		display(p1);
		System.out.println("_________________________________________");
		System.out.println(" names of patients who are children:");
		childrenList(p1);
		System.out.println("_________________________________________");
	}
	public static void populate(Patient[] arr,Scanner sc)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter name:");
			String pn=sc.next();
			System.out.println("Enter day:");
			int d=sc.nextInt();
			System.out.println("Enter month:");
			int m=sc.nextInt();
			System.out.println("Enter year:");
			int y=sc.nextInt();
			MyDate date=new MyDate(d,m,y);
			System.out.println("disesaseDes");
			String des=sc.next();
			
			arr[i]=new Patient(pn,new MyDate(d,m,y),des);
		}
	}
	public static void display(Patient[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("name: "+arr[i].getName()+" Disdes: "+arr[i].getDisesaseDes());
			
		}
	}
	public static void childrenList(Patient[] arr) {
		GregorianCalendar Obj=new GregorianCalendar();
		int currentyear= Obj.get(Calendar.YEAR);
		for(int i=0;i<arr.length;i++)
		{
			if((currentyear-arr[i].getDob().getYear())<18)
			{
				System.out.println("name: "+arr[i].getName());
			}
		}
		
		
	}
	
}
