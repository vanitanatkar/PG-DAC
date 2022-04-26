#include<stdio.h>
main()
{
int x[10],n,i,p,e;
printf("Enter number of elements:");
scanf("%d",&n);

printf("Enter x-array elements:");
for(i=0;i<n;i++)
scanf("%d",&x[i]);

printf("Enter the position to be inserted:");
scanf("%d",&p);
printf("Enter new element:");
scanf("%d",&e);

for(i=n;i>=p;i--)
x[i]=x[i-1];
x[p-1]=e;

for(i=0;i<n+1;i++)
printf("%d\n",x[i]);
}
