#include<stdio.h>
main()
{
int x[10],n,i,p,e;
printf("Enter number of elements:");
scanf("%d",&n);

printf("Enter x-array elements:");
for(i=0;i<n;i++)
scanf("%d",&x[i]);

printf("Enter the position to be modified:"); 
scanf("%d",&p);
printf("Enter new element:");
scanf("%d",&e);

x[p-1]=e;

for(i=0;i<n;i++)
printf("%d\n",x[i]);
}

