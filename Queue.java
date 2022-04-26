//First in First out
public class Queue {
	int arr [];
	int F;
	int R;


	Queue(int size)
	{
		arr=new int [size];
		 F=-1;
		 R=-1;
	}

	public void insert(int value)
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

	public int remove()
	{

		//first check for empty queue
		if(F==-1)
		{
			System.out.println("Queue is Empty");

			return 0;
		}
		int value=arr[F];

		if(F==R)
			//check if this is last value
			F=R=-1;
		else
			F++;

		return value;
	}
	public static Queue ConcatQueue(Queue q1,Queue q2)
	{
		Queue q3=new Queue(q1.arr.length+q2.arr.length);

		// k=0
		for(int i=q1.F;i<q1.arr.length;i++)
		{
			q3.insert(q1.arr[i]);
			//k++
		} 
		for(int j=q2.F;j<q2.arr.length;j++)
		{
			q3.insert(q2.arr[j]);
			//k++
		}
	
		return q3;
	}
	public static Queue sameAs(Queue q1,Queue q2)
	{
		// q2 ==> this
		// q1 ==> x
		
		q2.F = q1.F;
		q2.R = q1.R;
		
		for (int i = q1.F; (i != -1 && i <= q1.R) ; i++) 
		{
			q2.arr[i] =  q1.arr[i];
		}
		return q2;
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
