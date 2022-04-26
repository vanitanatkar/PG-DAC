#include<stdio.h>
main()
{
int x[10],y[10],n,i;
    printf("Enter number of elements:");
     scanf("%d",&n);

    printf("Enter x-array elements:");
      for(i=0;i<n;i++)
     scanf("%d",&x[i]);

   for(i=0;i<n;i++)
    y[n-i-1]=x[i];
    printf("x array\t y-array\n");
    for(i=0;i<n;i++)
     printf("%d\t%d\n",x[i],y[i]);
}
