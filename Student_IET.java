package Study;

public class Student_IET {
	private String name;
	private String lastname;
	private int age;
	private int graduation_year;
	private String graduation_stream;
	
	
	public Student_IET()
	{
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		if(!name.trim().equals(""))   //trim is used to remove spaces(Starting and ending) from string..bich ke space nahi remove karta
		this.name = name;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		if(!lastname.trim().equals(""))
		this.lastname = lastname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		if(age>=18 && age<=80)
		this.age = age;
	}


	public int getGraduation_year() {
		return graduation_year;
	}


	public void setGraduation_year(int graduation_year) {
		if(age<2021 || age>=2017)
		this.graduation_year = graduation_year;
	}


	public String getGraduation_stream() {
		return graduation_stream;
	}


	public void setGraduation_stream(String graduation_stream) {
		//COMPUTER, IT, ELECTRICAL,MECH ,CIVIL ,CHEMICAL,AUTO
		if(graduation_stream.equals("COMPUTER") || graduation_stream.equals("IT") || graduation_stream.equals("ELECTRICAL") || graduation_stream.equals("MECH") || graduation_stream.equals("CIVIL") || graduation_stream.equals("AUTO") || graduation_stream.equals("CHEMICAL") )
		this.graduation_stream = graduation_stream;
	}


	public String toString() {
		String str="name "+name+"lastname "+lastname+"age "+age+"graduation_year"+graduation_year+"graduation_stream"+graduation_stream;
		return str;
	}
	
	


	
	
}
