
public class Minmax {
	public int brr[];


	Minmax(int size)
	{
		brr=new int[size];

	}

	public static void Minimum(int brr[])
	{  

		int min=0;
		for(int i=0;i<brr.length;i++)
		{
			if(brr[i]<min)
				min=brr[i];
		}
		System.out.println("Minimum number ="+min);
	}

	public static void Maximum(int brr[])
	{  
		int max=0;
		for(int i=0;i<brr.length;i++)
		{
			if(brr[i]>max)
				max=brr[i];
		}
		System.out.println("Maximum number ="+max);
	}

	public static void SumArray(int brr[])
	{  
		int sum=0;
		for(int i=0;i<brr.length;i++)
		{
			sum=sum+brr[i];
		}
		System.out.println("Sum of Array ="+sum);
	}



}

