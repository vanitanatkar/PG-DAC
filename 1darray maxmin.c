#include<stdio.h>
main()
{
	int x[10],i,n,min,max;
	printf("Enter number of element:");
	scanf("%d",&n);
	
	printf("Enter x-array element:");
	for(i=0;i<n;i++)
	scanf("%d",&x[i]);
	
	min=x[0];
	max=x[0];
	
		for(i=0;i<n;i++)	
		{
			if(x[i]>max)
			max=x[i];
			if(x[i]<min)
			min=x[i];	
		}
		printf("max element=%d\n",max);
		printf("min element=%d\n",min);
}
