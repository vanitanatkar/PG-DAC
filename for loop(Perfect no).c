#include<stdio.h>
main()
{
	int n,i,sum;
	printf("Enter n:");
	scanf("%d",&n);
	
	sum=0;
	for(i=1;i<=n;i++)
	{
		if(n%i==0)
		sum=sum+i;
	}
	if(sum==n)
    	printf("%d is a perfect number\n",n);
	
	else
	printf("%d is not a perfect number",n);
}
