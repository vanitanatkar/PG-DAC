#include<stdio.h>
main()
{
	int i,n,ce=0,co=0;
	printf("Enter n:");
	scanf("%d",&n);
	 
	 for(i=1;i<=n;i++)
	 {
	 	if(i%2==1)
	 	{
	 	 printf("%d is odd\n",i);
	 	co++;	
		 }
		
		else
		{
			 printf("%d is enven\n",i);
	 	     ce++;
		 } 
		 printf("Number of Odd number=%d\n",co);
		 printf("Number of Even number=%d",ce);
	 }
}
