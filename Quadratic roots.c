#include<stdio.h>
#include<math.h>
main()
{
	int a,b,c;
	float k;
	printf("Enter a,b,c");
	scanf("%d%d%d",&a,&b,&c);
//The term b2-4ac is known as the discriminant of a quadratic
// equation.It tells the nature of the roots.
	k=pow(b,2)-4*a*c;
//If the discriminant is equal to 0, 
//the roots are real and equal.
	if(k==0)
	printf("root=%f\n",-b/(2*a));
//If the discriminant is greater than 0,
//the roots are real and different.
	else if(k>0)
	{
	printf("root1=%f\n",(-b+sqrt(k))/(2*a));
	printf("root1=%f\n",(-b-sqrt(k))/(2*a));
//If the discriminant is less than 0,
// the roots are complex and different.
   }
   else
	{	
	printf("root1=%f+i%f/n",-b/(2*a),sqrt(-k)/(2*a));
	printf("root2=%f-i%f/n",-b/(2*a),sqrt(-k)/(2*a));	
}
	
}
