package Study.Inheritance;

import Study.HasARelation.MyDate;

public class InternshipStude extends Student {
	private double stipend;

	public double getStipend() {
		return stipend;
	}

	public void setStipend(double stipend) {
		this.stipend = stipend;
	}
	
	public InternshipStude() {
		System.out.println("no parameter constructor of InternshipStudent called");
	}
	
	public InternshipStude(String name,MyDate dob,int rn,double stipend ) {
		
		super(name,dob,rn); //parameter constructor of Student
		this.stipend=stipend;
		System.out.println("parameter constructor of Internship stud called");
	}
	@Override
	public boolean equals(Object obj) {
		
		
		if ( obj instanceof InternshipStude )
		{
			InternshipStude temp =(InternshipStude )obj;
		   if(( this.getName()==temp.getName()) && (this.getDob().getDay()==temp.getDob().getDay()) && (this.getDob().getMonth()==temp.getDob().getMonth()) && (this.getDob().getYear()==temp.getDob().getYear()) && (this.getRollNo()==temp.getRollNo()) && (this.stipend==temp.stipend))
		return true;
		else
			return false;
		}
		else
			return false;
	}
	@Override
	public String toString() {
		String IStud=""+super.toString()+", stipend:"+stipend;
		return IStud;
	}

}
