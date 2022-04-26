#include<stdio.h>
main()
{
      int x[10],n,e,i,found,l,h,mid;
      printf ("Enter number of elements:");
      scanf("%d",&n);
      
	  printf("Enter x-array elements in ascending order:");
         for(i=0;i<n;i++)
          scanf("%d",&x[i]);

      printf("Enter the searching element:");
         scanf("%d",&e);
       
	   found=0;
          l=0;
           h=n-1;
        while(l<=h)
        {
           mid=(l+h)/2;
          if(e==x[mid])
           {  
             found=1;
               break;
            }      
           else if(e>x[mid])
                 l=mid+1;
            else h=mid-1;
        }
        if(found==1)
         printf("%d is Found",e);
        else
          printf("%d is not Found",e);
}

