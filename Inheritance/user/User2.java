package Study.Inheritance.user;

import Study.HasARelation.MyDate;
import Study.Inheritance.InternshipStude;

public class User2 {
	//Create InternShipStudent object with parameter constructor  , print the details
    public static void main(String[] args) {
    	InternshipStude is1=new InternshipStude("Radha",new MyDate(11,03,2002),14,15000);
    	
    	
    	System.out.println("Name:  "+is1.getName()+" DOB: "+is1.getDob().getDay()+"/"+is1.getDob().getMonth()+"/"+is1.getDob().getYear()+" RollNo: "+is1.getRollNo()+" stipend: "+is1.getStipend());
    	
		
    }  

}
    

