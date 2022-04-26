#include<stdio.h>
void f1();
void f2();
x=50; //extern varial
void main()
{
	printf("from main=%d\n",x);
	x=100;
	f1();
}
void f1()
{
	printf("from f1=%d\n",x);
	x=200;
	f2();
}
void f2()
{
	printf("from f2=%d\n",x);
}
