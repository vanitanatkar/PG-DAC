
public class Javaloops {
	int num;
	int X;
	int Y;

	Javaloops()
	{
		num=00;
		X=00;
		Y=00;
	}


	public static void fibonacci( int num )
	{
		int i,f,x=-1,y=1;

		for(i=1;i<=num;i++)
		{
			f=x+y;
			System.out.println("fibonacci no = "+f );
			x=y;
			y=f;
		}

	}
	public static void power(int X,int Y)
	{
		int p=0,i;
		for(i=1;i<Y;i++)
		{
			p=p+X*X;
		}
		System.out.println("X power Y="+p);
	}
	public static void Displayprime(int num)
	{
		 int i,j=1,count;
		 
		 while(j<=num)
	    {
		 	count=0;
		 	
		 	for(i=1;i<=j;i++)
	        {
	      	  if(j%i==0)
	      	  count++;	  
	        }
	        if(count==2)
		     System.out.println("Prime number="+j);
	    	 
			 j++;
		 } 
			
		}

	}



