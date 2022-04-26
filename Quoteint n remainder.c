#include<stdio.h>
main()
{
	int divident, divisor, quotient, remainder;

	printf("Enter devident:");
	scanf("\n%d" , &divident);
	printf("Enter divisor:");
	scanf("\n%d",&divisor);
	
    // Computes quotient
    quotient = divident/divisor;
    // computes remainder
    remainder = divident%divisor;
	printf("quotient=%d\n",quotient);
	printf("remainder=%d",remainder);
}
