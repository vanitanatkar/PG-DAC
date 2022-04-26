
public class CQueue {
	int arr [];
	int F;
	int R;

	public CQueue()
	{
		arr= new int[5];
		F=R=-1;
	}

	public CQueue(int size)
	{
		arr= new int [size];
		F=R=-1;
	}

	public void insert(int value)
	{
		if((F==0 && R==arr.length-1)||(R+1==F))
		{
			System.out.println("Queue is Full");
		}
		else
		{//we have some space in C-queue
			if(R==arr.length-1)
				R=0;
			else
				R++;

			//check if this is going to be first element in C-queue
			if(F==-1)
				F++;
			//now insert element in c-queue
			arr[R]=value;
		}	
	}

	public void remove( )
	{
		int value=0;
		if(F==-1)
		{
			System.out.println("Queue is Empty!");
		}
		else
		{
			//we have some element in queue
			value = arr[F];
			//check for last element
			if(F==R)
			{
				F=R=-1;
			}
			else
			{
				//we have more than one element
				if(F==arr.length-1)
					F=0;
				else
					F++;
			}
		}

	}
	public String toString()
	{
		String str = "";

		if(F==-1)
		{
			str="Queue is Empty";
		}
		else
		{
			int i=F;
			while (i!= R)
			{
				str = str + arr[i]+",";
				if(i==arr.length-1)
					i=0;
				else
					i++;
			}
			//to capture last element
			str=str+arr[i]+", ";
		}
		return str;	
	}


}
