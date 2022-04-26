int x=60; //global variable [extern]
void f1();
void f2();
#include<stdio.h>
main()
{
f2();
f1();
printf("%d\n",x); //prints 200. It is Modified global value
}
void f1()
{int x=50; //local variable [auto]
printf("%d\n",x); //prints 50. Takes local value.
x=100; //Modifies local x
}
void f2()
{
printf("%d\n",x); // prints 60. Global value
x=200; // Modifies global x
}

