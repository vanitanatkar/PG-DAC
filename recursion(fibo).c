#include<stdio.h>
int fibo(int);
int fibo(int n)
{
	if(n==0 || n==1)
	return n;
	else
	return fibo(n-1)+fibo(n-2);
}
main()
{
	int i;
	for(i=0;i<=10;i++)
	printf("%d\n",fibo(i));
}
