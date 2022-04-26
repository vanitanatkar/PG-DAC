#include<stdio.h>
main()
{
	int x[2][3]={{10,20,30},{40,50,60}},i,j;
	
	printf("%d\n\n",x[0][2]);
	
	for(i=0;i<2;i++);
	{
		for(j=0;j<3;j++);
		printf("%d\t",x[i][j]);
		printf("\n");
	}
}
