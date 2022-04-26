#include<stdio.h>
main()
{
	int i,n,count;
	printf("Enter n:");
	scanf("%d",&n);
	
	count=0;
	for(i=1;i<=n;i++)
	{
		if(n%i==0)
			count++;
	}
		    printf("no of factor=%d\n",count);
		if(count==2)
		    printf("%d is prime number\n",n);
		else
		     printf("%d is not a prime number\n",n);	
	
}
