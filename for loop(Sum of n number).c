#include<stdio.h>
main()
{
	int i,n,sum;
	printf("Eenter n:");
	scanf("%d",&n);
	sum=0;
	
	for(i=1;i<=n;i++)
	{
		printf("%d\n",i);
		sum=sum+i;
	}
	printf("Sum=%d",sum);
}
