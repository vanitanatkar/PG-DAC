#include<stdio.h>
main()
{
int n,i,j;

printf("Enter n:");
scanf("%d",&n);
for(i=1;i<=n;i++)
{for(j=1;j<=n;j++)
{
if(i+j>=n+1)
printf(" * ");
else
printf(" ");
}
printf("\n");
}
}

