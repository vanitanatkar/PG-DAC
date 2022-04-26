#include<stdio.h>
main()
{
	int x,y,z,big;
	 printf("Enter three different number:");
	 
	 scanf("%d%d%d",&x,&y,&z);
	 
	 big=x;
	if(y>big)
	  big=y;
	if(z>big)
	  big=z;
	  printf("biggest number=%d",big);   
}
