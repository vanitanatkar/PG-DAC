#include<stdio.h>
main()
{
    int x[5][5],y[5][5],m,n,i,j;
      printf("Enter number of rows and columns:"); 
	  scanf("%d%d",&m,&n);
    
	printf("Enter x-matrix elements:");
      for(i=0;i<m;i++)
       for(j=0;j<n;j++)
        scanf("%d",&x[i][j]);
      
	  printf("\nX-Matrix elements are:\n");
        for(i=0;i<m;i++)
         {
           for(j=0;j<n;j++)
              printf("%d\t",x[i][j]);
                  printf("\n");
         }
}
