
public class StudStack {
	Student []Student;
	int top;

	public StudStack()
	{
		Student=new Student[5];
		top=-1;
	}

	public void push(Student value)
	{
		if(top<Student.length-1)
		{
			top++;
			value= Student[top];	
			
		}
		else
			System.out.println("Stack overflow");

	}
	public void pop( Student value)
	{
		if(top>-1)
		{
			value =Student[top];
			top--;
		}
		System.out.println("Stack Underflow");

	}
	public String toString()
	{
		String str=" ";
		if(top>-1)
		{
			for(int j=top;j>=0;j--)
			{
				str=str+Student[j]+"";
			}
			str =str+"\n";
		}
		else
		str="str is Empty";  

		return str;
	}

}




