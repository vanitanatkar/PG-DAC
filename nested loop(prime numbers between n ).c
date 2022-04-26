#include<stdio.h>
main()
{
	int i,n,s,e,count;
	printf("Enter starting and ending number:");
	scanf("%d%d",&s,&e);
	
	for(n=s;n<=e;n++)
	{
		count=0;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			count++;
		}
		if(count==2)
		printf("%d\n",n);
	}
}
