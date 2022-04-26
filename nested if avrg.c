#include<stdio.h>
main()
{
	int m,p,c,avrg;
	printf("Enter three sub marks");
	scanf("%d%d%d",&m,&p,&c);
	
	if(m>=40 && p>=40 && c>=40)
	{
		avrg=(m+p+c)/3;
		printf("average marks=%d\n",avrg);
		
		if(avrg>=60)
		printf("first division");
		else if(avrg>=50)
		printf("second division");
		else
		printf("third division");
		
	}
	else
	printf("fail");
}
