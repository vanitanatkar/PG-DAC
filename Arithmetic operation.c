#include<stdio.h>
main()
{
	int x,y,a,b,c,d,e;
	printf("Enter x,y Value");
	scanf("%d%d",&x,&y);
	
	a=x+y;
	b=x-y;
	c=x*y;
	d=x/y;
	e=x%y;
	
	printf("\nsum=%d",a);
	printf("\ndifference=%d",b);
	printf("\nproduct=%d",c);
	printf("\nquotient=%d",d);
	printf("\nremainder=%d",e);

}
