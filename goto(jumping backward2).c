#include<stdio.h>
main()
{
	int i,n;
	printf("Enter n:");
	scanf("%d",&n);
	i=n;
	
	nareshit:
		printf("%d\n",i);
		i--;
		if(i>=1)
		goto nareshit;
	
}
