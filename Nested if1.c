#include<stdio.h>
main()
{
	int x,y,z;
	printf("Enter three different number");
	scanf("%d%d%d",&x,&y,&z);
	
	if(x>y)
	{
		if(x>z)
		printf("%d is biggest\n",x);	
	}
	if(y>x)
	{
	  if(y>z)
	  printf("%d is biggest\n",y);
	}
	if(z>x)
	{
		if(z>y)
		printf("%d is biggest\n",z);
	}
}
