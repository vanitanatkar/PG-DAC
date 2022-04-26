//Last in First out
public class Stack {
	int []arr;
	int top;

	public Stack()
	{
		arr=new int [5];
		top=-1;
	}

	public void push(int value)
	{
		if(top<arr.length-1)
		{
			top++;
			value=arr[top];	
			
		}
		else
			System.out.println("Stack overflow");

	}
	public void pop(int value)
	{
		if(top>-1)
		{
			value =arr[top];
			top--;
		}
		System.out.println("Stack Underflow");

	}
	public void displayStack(int []arr)
	{
		for(int i=1;i<arr.length;i++)
			System.out.println(arr[i]);
	}
	
	public String toString()
	{
		String str=" ";
		if(top>-1)
		{
			for(int j=top;j>=0;j--)
			{
				str=str+arr[j]+"";
			}
			str =str+"\n";
		}
		str="str is Empty";  

		return str;
	}

}



