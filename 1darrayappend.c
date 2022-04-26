#include<stdio.h>
main()
{
	int x[10],y[10],z[10],i,n;
	printf("enter number of element:");
	scanf("%d",&n);
	
	printf("Enter x-array element:");
	for(i=0;i<n;i++)
	scanf("%d",&x[i]);
	
	printf("Enter y-array element:");
	for(i=0;i<n;i++)
		scanf("%d",&y[i]);
		
		for(i=0;i<n;i++)
		{
		z[i]=x[i];
		z[n+i]=y[i];
	    }
	    for(i=0;i<2*n;i++)
		printf("%d\n",z[i]);
		
}

