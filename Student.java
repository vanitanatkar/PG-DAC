

public class Student {
	public String name;
	public int age;
	public int rollno;
	public int std;


	public Student(String n,int a)
	{
		name=n;
		age=a;	

	}
	public Student(String n,int a, int s,int ro)
	{
		name=n;
		age=a;
		std=s;
		rollno=ro;

	}

	public String toString()
	{
		String str= "name:" +name+",age:" +age+",std:" +std+",rollno:" +rollno;
		return str;
	}

}