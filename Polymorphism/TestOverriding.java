package Study.Polymorphism;

import Study.HasARelation.Book;
import Study.HasARelation.Circle;
import Study.HasARelation.MyDate;
import Study.HasARelation.Point;
import Study.HasARelation.Product;
import Study.Inheritance.Employee;
import Study.Inheritance.InternshipStude;
import Study.Inheritance.Patient;
import Study.Inheritance.Person;
import Study.Inheritance.Student;

public class TestOverriding {
	public static void main(String[] args) {
		//Override toString of   following classes and check if that toString is called at runtime/

		System.out.println("_______________MyDate_______________");
		MyDate d1=new MyDate(2,2,2022);
		MyDate d2=new MyDate(2,2,2022);
		System.out.println(d1);//Study.HasARelation.MyDate@7de26db8//after@Override Date:2/2/2022
		check(d2);//Study.HasARelation.MyDate@26f0a63f//after@Override Date:2/2/2022
		checkEquality(d1,d2);//they are equal
		//checkEquality(d1.toString(),d2.toString());//they are equal
		System.out.println(" "); 


		System.out.println("_______________Point_______________");
        Point p1=new Point(3,5);
        Point p2=new Point(3,5);
        check(p1);//Study.HasARelation.Point@182decdb//after@Override Point: (3,5)
        check(p2);//Study.HasARelation.Point@26f0a63f//after@Override Point: (3,5)
        checkEquality(p1,p2); //they are equal
       // checkEquality(p1.toString(),p2.toString());//they are equal
        System.out.println(" "); 

		System.out.println("_______________Circle_______________");
		Circle c1=new Circle(5,new Point(1,3));
		Circle c2=new Circle(5,new Point(1,3));
		check(c1);//Study.HasARelation.Circle@26f0a63f//Circle: radius=5,Point: (1,3)
		check(c2);//Study.HasARelation.Circle@4361bd48//Circle: radius=5,Point: (1,3)
		checkEquality(c1,c2);//they are equal
		//checkEquality(c1.toString(),c2.toString());//they are equal
		System.out.println(" ");

		System.out.println("_______________Product_______________");
		Product pd1=new Product("Pondstalks","powder",100,new MyDate(2,2,2022));
		Product pd2=new Product("Pondstalks","powder",100,new MyDate(2,2,2022));
		check(pd1);//Study.HasARelation.Product@26f0a63f//productname: Pondstalks   description: powder  cost: 100  DOE:Date:2/2/2022
		check(pd2);//Study.HasARelation.Product@4361bd48//productname: Pondstalks   description: powder  cost: 100  DOE:Date:2/2/2022
		checkEquality(pd1,pd2);//they are equal
		//checkEquality(pd1.toString(),pd2.toString());//they are equal
		System.out.println(" ");

		System.out.println("_______________Person_______________");
		Person pr1=new Person("Vanita",new MyDate(17,2,1996));
		Person pr2=new Person("Vanita",new MyDate(17,2,1996)); 
		check(pr1);//Person@26f0a63f//name:Vanita ,Date:17/2/1996
		check(pr2);//Person@26f0a63f//name:Vanita ,Date:17/2/1996
		//checkEquality(pr1,pr2);//they are equal
		checkEquality(pr1.toString(),pr2.toString());//they are equal

		System.out.println("_______________Student_______________");
		Student s1=new Student("Vanita",new MyDate(17,2,1996),11);
		Student s2=new Student("Vanita",new MyDate(17,2,1996),11);
		check(s1);//name: Vanita ,Date:17/2/1996, RollNo: 11
		check(s2);//name: Vanita ,Date:17/2/1996, RollNo: 11
		checkEquality(s1,s2);//they are equal
		//checkEquality(s1.toString(),s2.toString());//they are equal
		System.out.println(" ");

		System.out.println("_______________Employee_______________");
		Employee e1=new Employee("Vanita",new MyDate(17,2,1996),12,"HR",30000);
		Employee e2=new Employee("Vanita",new MyDate(17,2,1996),12,"HR",30000);
		check(e1);//name: Vanita ,Date:17/2/1996, empID:12, department: HR, salary:30000.0
		check(e2);//name: Vanita ,Date:17/2/1996, empID:12, department: HR, salary:30000.0
	    checkEquality(e1,e2);//they are equal
	   // checkEquality(e1.toString(),e2.toString());//they are equal
	    System.out.println(" ");
		 
		System.out.println("_______________Patient_______________");
		Patient pt1=new Patient("Divya",new MyDate(12,1,2000),"Covid +ive");
		Patient pt2=new Patient("Divya",new MyDate(12,1,2000),"Covid +ive");
		check(pt1);
		check(pt2);
		checkEquality(pt1,pt2);//they are equal
		//checkEquality(pt1.toString(),pt2.toString());//they are equal
		System.out.println(" ");
 
		System.out.println("_______________InternshipStudent_______________");
		InternshipStude is1=new InternshipStude("Nita",new MyDate(12,2,2001),22,15000);
		InternshipStude is2=new InternshipStude("Nita",new MyDate(12,2,2001),22,15000);
        check(is1);//name: Nita ,Date:12/2/2001, RollNo: 22, stipend:15000.0
        check(is2);//name: Nita ,Date:12/2/2001, RollNo: 22, stipend:15000.0
        checkEquality(is1,is2);//they are equal
        //checkEquality(is1.toString(),is2.toString());//they are equal
        System.out.println(" ");
      
		System.out.println("_______________BOOK_______________");
		String[] author =new String[] {"author_1","author_2"};
		Book b1 = new Book("10%Happier",152.0f,author);
		Book b2 = new Book("10%Happier",152.0f,author);
		check(b1);
		check(b2);
		checkEquality(b1,b2);//they are equal
		//checkEquality(b1.toString(),b2.toString());  //they are equal
        
	}

	public static void check(Object obj )
	{
		System.out.println(obj.toString());  
	} 

	public static void checkEquality(Object obj1, Object obj2)
	{
		if (obj1.equals(obj2) )
			System.out.println("they are equal");  
		else
			System.out.println("they are not equal");
	}
}
