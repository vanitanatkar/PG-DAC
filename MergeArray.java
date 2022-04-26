
public class MergeArray {



	public static void merge(int []crr,int []arr,int []brr)
	{  

		int ai,bi,ci;
		ai=bi=ci=0;

		while((ai<arr.length) && (bi<brr.length) &&(ci<crr.length))
		{
			if(arr[ai]<brr[bi])
			{
				crr[ci]=arr[ai];
				ai=ai+1;
			}
			else if(arr[ai]>brr[bi])
			{
				crr[ci]=brr[bi];
				bi=bi+1;
			}
			else
			{ crr[ci]=arr[ai];
			ai=ai+1;
			bi=bi+1;
			}
			ci=ci+1;
		}
		while(ai<arr.length)
		{
			crr[ci]=arr[ai];
			ai=ai+1;
			ci=ci+1;
		}
		while(bi<brr.length)
		{
			crr[ci]=brr[bi];
			bi=bi+1;
			ci=ci+1;
		}


	}

}
