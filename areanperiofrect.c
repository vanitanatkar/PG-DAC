#include<stdio.h>

main()
{
	int l,b,a,p;
	
	printf("Enter lenght and breadth");
	scanf("%d%d",&l,&b);
	//area and perimeter of rectangle
	a=l*b;
	p=2*l*b;
	
	printf("area=%d\tperimeter=%d",a,p);
	
	return 0;
}
		
	

