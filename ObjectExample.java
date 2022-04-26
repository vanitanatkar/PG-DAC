package Study;

import java.util.Scanner;

import Study.HasARelation.Book;
import Study.HasARelation.Circle;
import Study.HasARelation.MyDate;
import Study.HasARelation.Point;
import Study.HasARelation.Product;
import Study.Inheritance.Employee;
import Study.Inheritance.Student;
//DOWNCASTING
public class ObjectExample {
	public static void main(String[] args) {
	
		//func1(new Object());
		func1(new Scanner("Vanita"));
	    //func1(new String("hello"));
		//func1(new Circle(5,new Point(2,4)));
		//func1(new Employee("Vanita",new MyDate(2,2,2000),12,"HR",5000));
		
		/*
		func1(new Student("gita",new MyDate(1,2,2002),11));
		func1(new MyDate(17,2,2005));
		func1(new Point(5,7));    //run time
		func1(new Product("ParleG","Cookies",5,new MyDate(2,4,2021)));
        */
	}
	public static void func1(Object obj) //java.lang  //compile time
	{
		//System.out.println(obj.hashCode());
		//System.out.println(obj.toString().toUpperCase());
		
	
		if(obj instanceof Scanner) {
			String name=((Scanner)obj).nextLine();
			System.out.println(name+"");
		}
		if(obj instanceof Circle) {
			((Circle)obj).getRadius();
		}
		if(obj instanceof Employee) {
			((Employee)obj).getSalary();
		}
		
		/*
		if(obj instanceof Student) {
		((Student)obj).setRollNo(10);}
		
		if(obj instanceof MyDate) {
			((MyDate)obj).setYear(2001);}
		
		if(obj instanceof Point) {
			((Point)obj).setX(4);}

		if(obj instanceof Product)
		{
			((Product)obj).setCost(10);
		}
		
		*/	
	}
	

}
