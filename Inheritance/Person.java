package Study.Inheritance;
import Study.HasARelation.MyDate;

public class Person {
	private String name;
	private MyDate Dob;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public MyDate getDob() {
		return Dob;
	}
	public void setDob(MyDate dob) {
		Dob = dob;
	}
	public Person()
	{
		System.out.println("Person no parameter constructor called ");
	}
	public Person(String name,MyDate Dob)
	{
		this.name=name;
		this.Dob=Dob;
		System.out.println("Parameter constructor of person called");
	}
	//public boolean equals(Object object) {
		
		
	@Override
	public boolean equals(Object obj) {
		
		
		if ( obj instanceof Person)
		{
		   Person temp =(Person)obj;
		   if(( this.name==temp.name) && (this.Dob.getDay()==temp.Dob.getDay()) && (this.Dob.getMonth()==temp.Dob.getMonth()) &&(this.Dob.getYear()==temp.Dob.getYear()))
		return true;
		else
			return false;
		}
		else
			return false;
	}
	
	@Override
	public String toString() {
		String person="name: "+name+" ,"+Dob;
		return person;
	}

}
