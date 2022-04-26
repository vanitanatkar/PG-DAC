
public class SortStud {

	public static void Selection(Student[] arr, boolean isDes)
	{

		for(int j=0;j<arr.length-1;j++)
		{
			Student temp = arr[j];

			for(int i=(j+1);i<arr.length;i++)
			{
				if(isDes)
				{	
					if(arr[i].getRollno()>temp.getRollno())//here greater temp 
					{
						Student x=arr[i];
						arr[i]=temp;
						temp=x;
					}

				}
				else
					if(arr[i].getRollno()<temp.getRollno())//here greater than sign is used for Ascending
					{
						Student x=arr[i];
						arr[i]=temp;
						temp=x;
					}
			}
			arr[j]=temp;
		}
		
	}

	public static void Insertion(Student[]arr,boolean isDes)
	{

		for(int i=0;i<arr.length;i++)
		{
			Student temp=arr[i];
			int k=i-1; //....k=-1
			while(k>=0)
			{
				if(isDes)
				{
					if(temp.getRollno()<arr[k].getRollno()) ///temp=arr[i]
					{
						arr[k+1]=arr[k];  //arr[1]=arr[0]
						k--;    //k=-1
					} 
					else
						break;
				}
				else
				{
					if(temp.getRollno()<arr[k].getRollno()) ///temp=arr[i]
					{
						arr[k+1]=arr[k];  //arr[1]=arr[0]
						k--;    //k=-1
					} 
					else
						break;

				}
			}
			arr[k+1]=temp; //k=-1
		}

	}	
	public static void Bubble(Student []arr,boolean isDes)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-1; j++)
			{
				if(isDes)
				{
					if(arr[j+1].getRollno()<arr[j].getRollno())  //descending
					{
						Student x = arr[j+1];
						arr[j+1] = arr[j];
						arr[j] = x;
					}
				}
				else 
				{
					if(arr[j+1].getRollno()>arr[j].getRollno()) //ascending
					{
						Student x = arr[j+1];
						arr[j+1] = arr[j];
						arr[j] = x;
					}
				}
			} 
		}

	}
	
	public static void Quick(Student[] arr)
	{
		Quick(arr, 0, arr.length-1);
	}

	private static void Quick(Student[] arr, int l, int h) 
	{
		if(l < h)
		{
			int loc = partition(arr, l, h);
			
			Quick(arr, l, loc-1);  //Sort left side of the location
			
			Quick(arr, loc+1, h);  //Sort right side of the location
		}
	}
    private static int partition(Student[] arr, int l, int  h) 
    {
		//int (pivot)pi = arr[h];
		int j = l;
		int i = j-1;
		
		while(j<= h)  // this is for path(0 to arr length -1)
		{
			if(arr[j].getRollno() < arr[h].getRollno())
	 		{
				i++;
				//swap(arr[i], arr[j]);
				Student tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
			j++; 
		}
		i++;
		//swap(arr[i], arr[h]);
		Student tmp = arr[i];
		arr[i] = arr[h];
		arr[h] = tmp;
		
		return i;
	} 
}









