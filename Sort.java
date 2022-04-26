
public class Sort {
	
	public static void Selection(int []arr, boolean isDes)
	{

		int temp=0,i,j,x;
		for(j=0;j<arr.length-1;j++)
		{
			temp = arr[j];

			for(i=(j+1);i<arr.length;i++)
			{
				if(isDes)
				{	
					if(arr[i]>temp)//heregreater than sign is used Descending
					{
						x=arr[i];
						arr[i]=temp;
						temp=x;
					}
				}
				else
					if(arr[i]<temp)//here less  than sign is used for ascending
					{
						x=arr[i];
						arr[i]=temp;
						temp=x;
					}
			}

			arr[j]=temp;
		}
	}



	public static void Insertion(int []arr,boolean isDes)
	{
		int i,k,temp;

		for(i=0;i<arr.length;i++)
		{
			temp=arr[i];
			k=i-1; //....k=-1
			while(k>=0)
			{
				if(isDes)
				{
					if(temp>arr[k]) ///temp=arr[i]
					{
						arr[k+1]=arr[k];  //arr[1]=arr[0]
						k--;    //k=-1
					} 
					else
						break;
				}	

				else
				{
					if(temp<arr[k]) ///temp=arr[i]
					{
						arr[k+1]=arr[k];  //arr[1]=arr[0]
						k--;    //k=-1
					} 
					else
						break;
				}
			}//while loop end
			arr[k+1]=temp; //k=-1
		}//for loop end 

	}	


	public static void Bubble(int []arr,boolean isDes)//O(n2)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-1; j++)
			{
				if(isDes)
				{
					if(arr[j+1] >  arr[j])
					{
						int x = arr[j+1];
						arr[j+1] = arr[j];
						arr[j] = x;
					}

				}
				else
				{
					if(arr[j+1] <  arr[j])
					{
						int x = arr[j+1];
						arr[j+1] = arr[j];
						arr[j] = x;
					}
				}
			}
		}
	}
	
	public static void Quick(int[] arr)
	{
		Quick(arr, 0, arr.length-1);
	}

	private static void Quick(int[] arr, int l, int h) 
	{
		if(l < h)
		{
			int loc = partition(arr, l, h);
			
			Quick(arr, l, loc-1);  //Sort left side of the location
			
			Quick(arr, loc+1, h);  //Sort right side of the location
		}
	}
    private static int partition(int[] arr, int l, int h) 
    {
		//int (pivot)pi = arr[h];
		int j = l;
		int i = j-1;
		
		while(j <= h)  // this is for path(0 to arr length -1)
		{
			if(arr[j] < arr[h])
	 		{
				i++;
				//swap(arr[i], arr[j]);
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
			j++; 
		}
		i++;
		//swap(arr[i], arr[h]);
		int tmp = arr[i];
		arr[i] = arr[h];
		arr[h] = tmp;
		
		return i;
	} 
}

	

