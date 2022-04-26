#include<stdio.h>
main()
{
	int i,n,sum,x=1;
	printf("Enter n:");
	scanf("%d",&n);
	
	sum=0;
	for(i=1;i<=n;i++)
	{
		printf("%d\n",i);
		sum=sum+i*i*x;
		x=-x;
	}
	printf("sum=%d",sum);
}

