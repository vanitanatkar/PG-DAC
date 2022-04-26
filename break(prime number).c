#include<stdio.h>
main()
{
	int n,i,found;
 printf("Enter n:");
  scanf("%d",&n);
  
  found=0;
  for(i=2;i<n;i++)
{
if(n%i==0)
{
found=1;
break;}
}
if(found==0)
printf("%d is prime number",n);
else
printf("%d is not a prime number",n);
}
