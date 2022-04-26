#include<stdio.h>
main()
{
	int x[10],i,n,sum=0;
	printf("Enter number of element:");
	scanf("%d",&n);
	
	printf("Enter x-array element:");
	for(i=0;i<n;i++)
	scanf("%d",&x[i]);
	
	for(i=0;i<n;i++)
	sum=sum+x[i];
	
	printf("sum of element=%d",sum);
}
