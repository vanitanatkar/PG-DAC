#include<stdio.h>
main()
{
	int i,n;
	printf("Enter n:");
	scanf("%d",&n);
	i=1;
	
	abc:
		printf("%d*%d=%d\n",n,i,n*i);
		i++;
		if(i<=10)
		goto abc;
}
