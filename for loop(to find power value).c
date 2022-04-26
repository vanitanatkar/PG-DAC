#include<stdio.h>
main()
{
	int n,p,r=1,i;

    printf("Enter a number AND power:"); 
	scanf("%d%d",&n,&p);
    for(i=1;i<=p;i++)
       r=r*n;
     printf(" %d power %d=%d",n,p,r);

}
