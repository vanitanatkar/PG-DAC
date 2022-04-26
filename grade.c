#include<stdio.h>

main()
{
 char grade,A,a,B,b,C,c,D,d,E,e;
   
  printf("Enter grade:");
  scanf("%c",&grade);
  
  if (grade==A || grade==a)
  printf("grade is Excellent");

  else if(grade==B || grade==b)
  printf("grade is Good");

  else if(grade==C || grade==c)
  printf("grade is Fair");

  else if(grade==D || grade==d)
  printf("grade is Poor");

  else if (grade==E || grade==e)
   printf("grade is failure");
  
  else 
  printf("grade is not available");
  return 0;
}
