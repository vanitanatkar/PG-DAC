#include<stdio.h>
main()
{
char x[20],y[20];
printf("Enter a String:");
scanf("%s",x);
printf("%s\n",x);

fflush(stdin);
printf("Enter a string:");
gets(y);
puts(y);

}

