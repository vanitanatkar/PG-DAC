#include<stdio.h>
main()
{
	int x=5,y;
	//post increment
	//In this statement, first x value will be assigned to y. 
	//Then x value will be increased.
	y=x++;
	printf("%d",x);
	printf("\n%d",y);
	//Pre Increment
	//In this statement, first x value will be increased. 
	//Then x value be assigned to y.
	y=++x;
	printf("\n%d",x);
	printf("\n%d",y);
	
}
