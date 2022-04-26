#include<stdio.h>
main()
{
	int i,n;
	printf("Enter n:");
	scanf("%d",&n);
	
	i=1;
	nareshit:
		printf("%d\n",i);
		i++;
		
		if(i<=n)
		goto nareshit;
}
