package Study.Inheritance;

import Study.HasARelation.MyDate;

public class Employee extends Person {
	private int empId;
	private String depat;
	private double salary;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDepat() {
		return depat;
	}
	public void setDepat(String depat) {
		this.depat = depat;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
  public Employee()
  {
	  System.out.println("Employee no-parameter contructor called");
  }
  public Employee(String nm,MyDate d,int empId,String dep,double sal) {
	super(nm,d);
	this.empId=empId;
	this.depat=dep;
	this.salary=sal;
	System.out.println("parameter contructor of Employee called");
  }
  @Override
	public boolean equals(Object obj) {
		
		
		if ( obj instanceof Employee)
		{
		   Employee temp =(Employee)obj;
		   if(( this.getName()==temp.getName()) && (this.getDob().getDay()==temp.getDob().getDay()) && (this.getDob().getMonth()==temp.getDob().getMonth()) && (this.getDob().getYear()==temp.getDob().getYear()) && (this.empId==temp.empId) && (this.depat==temp.depat) &&(this.salary==temp.salary))
		return true;
		else
			return false;
		}
		else
			return false;
	}
  @Override
public String toString() {
	String Employee=""+super.toString()+", empID:"+empId+", department: "+depat+", salary:"+salary;
	return Employee;
}
}
