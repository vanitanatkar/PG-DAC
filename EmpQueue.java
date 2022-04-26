//first in first out
public class EmpQueue {
	Employee arr[];
	int R;
	int F;


	public EmpQueue(int size)
	{
		arr=new Employee [size];
		 R=-1;
		 F=-1;
	}

	public void insert(Employee value)
	{
		if(R<arr.length-1)
		{	
			R++;
			arr[R]=value;
			//check for 1st value insertion 
			if(F == -1)
				F=0;
		}
		else
			System.out.println("Queue is full");

	}

	public Employee remove()
	{
		//first check for empty queue
		if(F==-1)
		{
			System.out.println("Queue is Empty");
              return null;
		}
		Employee value =arr[F];//front empty

		if(F==R)
			//check if this is last value
			F=R=-1;
		else
			F++;

		return value;
	}			
   
	
	public String toString()
	{
		String str="";
		if(F==-1)
		{
			System.out.println("Queue is Empty");
			return str;
		}
		else
		for(int i=F;i<=R;i++)
		{
			str+=arr[i]+", ";
		}
		return str;

	}

}
