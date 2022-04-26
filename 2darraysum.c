#include<stdio.h>
main()
{
int x[5][5],n,i,j,sum=0;
printf("Enter number of rows or columns:");
scanf("%d",&n);

printf("Enter x-matrix elements:");
for(i=0;i<n;i++)
for(j=0;j<n;j++)
scanf("%d",&x[i][j]);

for(i=0;i<n;i++)
for(j=0;j<n;j++)
sum=sum+x[i][j];

printf("sum of elements=%d",sum);
}

