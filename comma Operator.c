#include<stdio.h>
main()
{
	int x,y,z,a;
	x=1,y=2,z=3;
	printf("x=%d/ty=%d/tz=%d",x,y,z);
	a=(x,y,z);
	printf("\na=%d",a);
	a= x=x+1,y=x+y,z=y+z;
	printf("\na=%d",a);
		
}
