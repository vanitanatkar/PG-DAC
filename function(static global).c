#include<stdio.h>
void f1();
static int x=0; //static global variable
void f1()
{
x++;
printf("function call number is=%d\n",x); 
}
main()
{
int i;
for(i=1;i<=5;i++)
f1();
printf("number of function calls=%d",x); 
}

