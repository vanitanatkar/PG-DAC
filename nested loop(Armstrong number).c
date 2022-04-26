#include<stdio.h>
main()
{
	int d,i,n,temp,s,e,sum;
	printf("Enter starting and Ending value:");
	scanf("%d%d",&s,&e);
	for(n=s;n<=e;n++)
	{
		temp=n;
		sum=0;
	while(n!=0)
		{
		d=n%10;
		sum=sum+d*d*d;
		n=n/10;	
			
		}
		if(sum==temp)
		printf("%d\n",temp);
		
		n=temp;
	}
}
