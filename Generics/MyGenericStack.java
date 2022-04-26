package Study.Generics;

public class MyGenericStack<T> {
	private T[] arr;
	int topIndex=-1;

	public MyGenericStack(T[] ar)
	{
		arr= ar;
	}

	public void push(T obj)
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


	public T pop()
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


