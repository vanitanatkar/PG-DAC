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
		{
			printf("%d\n",i);
			count++;
		}
		
	}
	printf("Number of factor=%d",count);
}
