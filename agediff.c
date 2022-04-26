#include<stdio.h>

main()
{
  int a;
  printf("Enter age:");
  scanf("%d",&a);
  
 if(a<18)
 printf(" a is child");
 
 else if(a==18 || a>=18|| a==65 || a<=65)
 printf(" a is Aduld");

 else
 printf("a is Senior citizen");
 
 return 0;

}
