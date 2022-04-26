#include<stdio.h>
main()
{
	
	int x,y,q,r;
	
	printf("Enter two no:");
	scanf("%d%d",&x,&y);
	
	q=x/y;
	r=x%y;
	
	printf("quot=%d,remin=%d",q,r);
	
	return 0;
	
}
