#include<stdio.h>
main()
{
    int x[10],y[10],z[20],n,i;
    
     printf("Enter number of elements:"); 
	 scanf("%d",&n);
	 
     printf("Enter x-array elements:");
       for(i=0;i<n;i++)
        scanf("%d",&x[i]);
        
        printf("Enter y-array elements:");
        for(i=0;i<n;i++)
         scanf("%d",&y[i]);
       for(i=0;i<n;i++)
        {
            z[i]=x[i];
            z[n+1]=y[i];
        }
         for(i=0;i<2*n;i++)
          printf("%d\n",z[i]);
        }
