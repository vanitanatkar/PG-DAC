#include<stdio.h>
main()
{
	int x[10],i,n,j,temp;
	printf("Enter number of element:");
	scanf("%d",&n);
	
	printf("Enter x-array element:");
	for(i=0;i<n;i++)
	scanf("%d",&x[i]);
	
	for(i=1;i<n;i++)
	{
		for(j=1;j<n-1;j++)
		{
			if(x[j]>x[j+1])
			{
				temp=x[j];
				x[j]=x[j+1];
				x[j+1]=temp;
			}
		}
	}
	for(i=0;i<n;i++)
	printf("%d\n",x[i]);
}
