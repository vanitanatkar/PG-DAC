#include<stdio.h>
main()
{
	
	int i,n,f,x=-1,y=1;
	// num1=0;num2=1;num3=0
	printf("Enter n:");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		f=x+y;
		printf("%d\n",f);
		x=y;
		y=f;
	}
}
