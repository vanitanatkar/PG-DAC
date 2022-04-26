public class Employee 
{
	 int empid;
	 String name;
	 float salary;	

	Employee(int id, String n, float sal)
	{
		
		empid=id;
		name=n;
		salary=sal;	
	}

	Employee(String n, float sal)
	{
		name=n;
		salary=sal;
			
	}
	public String toString()
	{		
		String str = "(empid:" + empid + ", name:" + name + ", salary : " +salary +")";
		return str;
	}

}
