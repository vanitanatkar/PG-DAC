#include<stdio.h>
main()
{
	int x[10],i,n;
	printf("Enter number of elements:");
	 scanf("%d",&n);
	 
	printf("Enter x-array elements:");
	  for(i=0;i<n;i++)
	   scanf("%d",&x[i]);
	   
    for(i=n-1;i>=0;i--)
    printf("%d\n",x[i]);
}
