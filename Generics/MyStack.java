package Study.Generics;

public class MyStack {
	private Object[] arr;
	int topIndex=-1;
	
	public MyStack(Object[] ar)
	{
		arr= ar;
	}
	
	public void push(Object obj)
	{
		int temp = ++topIndex;
		if(temp < arr.length)
		  arr[temp] = obj;
		else
		{
			System.out.println("stack full");
		}
			//throw new StackFullException();
	}
	
	
	public Object pop()
	{
		int temp = topIndex;
		if(temp >=0)
		{
			return arr[topIndex--];
		}
		else
			return null;
	}
	
	public void display()
	{
		for(int i=0;i<=topIndex;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
//here stack object created with push and pop function it accept any object type i.e ...integer,string MyDate etc

