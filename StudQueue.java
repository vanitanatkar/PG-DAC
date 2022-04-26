
public class StudQueue {
	Student arr[];
	int R;
	int F;
	

	StudQueue(int size)
	{
		arr=new Student [size];
		int R=-1;
		int F=-1;
	}

	public void insert(Student value)
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

	public Student remove()
	{
		//first check for empty queue
		if(F==-1)
		{
			System.out.println("Queue is Empty");
			
		    return null;
	    }
		Student value =arr[F];

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
		     
		     
		 for(int i=F;i<=R;i++)
		 {
			str+=arr[i]+", ";
		 }
		 return str;
			 
	 }


}

