package Study.Inheritance.user;

import Study.HasARelation.MyDate;
import Study.Inheritance.Employee;

public class User4 {
	public static void main(String[] args) {
		
		
		/*Create Employee object using first no-parameter constructor and setters  } print details
		Create Employee object using parameter constructor  } print details*/
		
		Employee e1 = new Employee();
		e1.setName("Raj");
		e1.setDob(new MyDate(1,4,2001));
		e1.setEmpId(11);
		e1.setDepat("Plannig");
		e1.setSalary(50000);
		
		System.out.println("name: "+e1.getName()+" DOB: "+e1.getDob().getDay()+"/"+e1.getDob().getMonth()+"/"+e1.getDob().getYear()+" empID: "+e1.getEmpId()+" Depat:"+e1.getDepat()+" sal:"+e1.getSalary());
		
		System.out.println("_____________________________________________________________");
		
		Employee e2 = new Employee("Meghraj",new MyDate(3,06,1995),22,"Purchase",25000);
		System.out.println("name: "+e2.getName()+" DOB: "+e2.getDob().getDay()+"/"+e2.getDob().getMonth()+"/"+e2.getDob().getYear()+" empID: "+e2.getEmpId()+" Depat:"+e2.getDepat()+" sal:"+e2.getSalary());
		
		System.out.println("_____________________________________________________________");
	}

}
