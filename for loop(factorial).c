#include<stdio.h>
main()
{
	int i,n=8,f=1;
	
	for(i=1;i<=n;i++)
	f=f*i;
	
	printf("%d!=%d",n,f);
}
