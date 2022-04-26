#include<stdio.h>
main()
{
int x[5][5],n,i,j,sum=0;

printf("Enter number of rows or columns:");
scanf("%d",&n);

printf("Enter x-matrix elements:");
for(i=0;i<n;i++)for(j=0;j<n;j++)
scanf("%d",&x[i][j]);
//principal element=x[0][0]+x[1][1]+x[2][2]..
//like that here i & j both same
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i==j)
sum=sum+x[i][j];
}
}
printf("sum of elements=%d",sum);
}
