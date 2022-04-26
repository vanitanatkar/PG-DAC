#include<stdio.h>
main()
{
	int i,n,s,e,sum;
	printf("Enter starting and Ending number:");
	scanf("%d%d",&s,&e);
	
	for(n=s;n<=e;n++)
	{
		sum=0;
		for(i=1;i<n;i++)
		{
			if(n%i==0)
	     	sum=sum+i;
		}
		if(sum==n)
		printf("%d\n",n);
	}
}
