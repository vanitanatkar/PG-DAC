package Study.Inheritance;

import Study.HasARelation.MyDate;

public class Student extends Person {

	private int rollNo;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public Student()
	{
		System.out.println("student no-parameter contructor called");
	}

	public Student(String name,MyDate date,int rollNo)
	{
		//super()  ->person no parameter constructor called by default called
		super(name,date);  
		this.rollNo=rollNo;
		System.out.println("parameter constructor of Student called");
	}
	@Override
	public boolean equals(Object obj) {
		
		
		if ( obj instanceof Student)
		{
		   Student temp =(Student)obj;
		   if(( this.getName()==temp.getName()) && (this.getDob().getDay()==temp.getDob().getDay()) && (this.getDob().getMonth()==temp.getDob().getMonth()) &&(this.getDob().getYear()==temp.getDob().getYear()) && (this.rollNo==temp.rollNo))
		return true;
		else
			return false;
		}
		else
			return false;
	}
	
	@Override
	public String toString() {
		String Student=""+super.toString()+", RollNo: "+rollNo;
		return Student;
	}

}





