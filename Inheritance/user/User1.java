package Study.Inheritance.user;

import Study.HasARelation.MyDate;
import Study.Inheritance.Student;

public class User1 {
	public static void main(String[] args) {
		//Create Student object with no parameter constructor , set all properties using setter and print them

		Student s1=new Student();
		s1.setName("Vanita");
		s1.setDob(new MyDate(17,02,1996));
		s1.setRollNo(12);

		System.out.println("Studname: "+s1.getName()+"  StudRollNo: "+s1.getRollNo()+"  DOB: "+s1.getDob().getDay()+"/"+s1.getDob().getMonth()+"/"+s1.getDob().getYear());




	}

}
