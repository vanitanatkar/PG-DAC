
public class StackStudent {
	int arr[];
	int top;

	public Student()
	{
		arr=new int [5];
		top=-1;
	}

	public void push(int value)
	{
		if(top<arr.length-1)
		{
			value=arr(top);	
			top++;
		}
		else
			System.out.println("Stack overflow");

	}
	public void pop(int value)
	{
		if(top>-1)
		{
			value =arr(top);
			top--;
		}
		System.out.println("Stack Underflow");

	}
}
