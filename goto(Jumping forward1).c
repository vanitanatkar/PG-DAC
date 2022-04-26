#include<stdio.h>
main()
{
	int n;
	printf("Enter +ve value:");
	scanf("%d",&n);
	
	if(n>0)
	goto abcd;
	n=-n;
	
	abcd:
		printf("%d",n);
}
