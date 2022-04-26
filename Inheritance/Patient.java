package Study.Inheritance;

import Study.HasARelation.MyDate;

public class Patient extends Person {
	private String disesaseDes;

	public String getDisesaseDes() {
		return disesaseDes;
	}

	public void setDisesaseDes(String disesaseDes) {
		this.disesaseDes = disesaseDes;
	}
	public Patient() {
		System.out.println("Patient no-parameter constructor called");
	}
	public Patient(String n,MyDate d,String disdes)
	{
		super(n,d);//person parameter constructor called
		this.disesaseDes=disdes;
		System.out.println("Parameter constructor of Patient Called");
	}
	@Override
	public boolean equals(Object obj) {
		
		
		if ( obj instanceof Patient)
		{
		   Patient temp =(Patient)obj;
		   if(( this.getName()==temp.getName()) && (this.getDob().getDay()==temp.getDob().getDay()) && (this.getDob().getMonth()==temp.getDob().getMonth()) &&(this.getDob().getYear()==temp.getDob().getYear()) && (this.disesaseDes==temp.disesaseDes))
		return true;
		else
			return false;
		}
		else
			return false;
	}
	@Override
	public String toString() {
		String patient=""+super.toString()+", disesaseDes:"+disesaseDes;
		return patient;
	}

}
