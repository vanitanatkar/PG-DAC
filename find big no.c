#include<stdio.h>
main()
{
	int x,y,z,big;
	printf("Enter 3 number");
	scanf("%d%d%d",&x,&y,&z);
	
	if(x>y && x>z)
	printf("%d is big",x);
	else if(y>x && y>z)
	printf("%d is big",y);
	else 
	printf("%d is big",z);
}
