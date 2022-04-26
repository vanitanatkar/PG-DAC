import java.util.Scanner;
public class MainUtil {
	public static void main(String[] args) {
        System.out.println("**********Well-Come***********");
		Scanner sc= new Scanner(System.in);
		while(true)
		{	
			
			System.out.println("1.getSquare of number  2.getFactorial of number  3.isPrime or not 4.fibbonacci series 5.Armstrongnum:");
			System.out.println("Enter your Choice:");
			System.out.println("_________________ ");
			int ch =sc.nextInt();
			if(ch > 5) {break;}
			switch(ch)

			{
			case 1:
				System.out.println(" Enter Number:");
				int num1= sc.nextInt();
				getSquare(num1);
				break;
			case 2:
				System.out.println(" Enter Number:");
				int num2= sc.nextInt();
				getFactorial(num2);
				break;
			case 3:
				System.out.println(" Enter Number:");
				int num3= sc.nextInt();
				isPrime(num3);
				break;
			case 4:
				System.out.println(" Enter Number:");
				int num4= sc.nextInt();
				fibbonacci(num4);
				break;
			case 5 :
				System.out.println(" Enter Number:");
				int num5= sc.nextInt();
				armstrongNum(num5);
				break;
			}   
		}

	}

	public static void getSquare(int num1)
	{
		int sum=0;
		sum=num1*num1;
		System.out.println("sum="+sum);
	}

	public static void getFactorial(int num1)
	{
		int i=1,fact=1;

		for(i=1;i<=num1;i++)
		{
			fact=fact*i; 
		}
		System.out.println("Factorial of number:"+fact);

	}

	public static void isPrime(int num1)
	{
		int i,count=0;

		for(i=1;i<=num1;i++)
		{
			if(num1%i==0) 
			{
				count++;

			}
		}

		if(count==2)
			System.out.println("Number is Prime"+num1);

		else
			System.out.println("Number is not Prime"+num1);
	}
	public static void fibbonacci(int num1)
	{
		int i,f,x=-1,y=1;

		for(i=1;i<=num1;i++)
		{
			f=x+y;
			System.out.println("fibonacci no = "+f );
			x=y;
			y=f;
		}
	}

	public static void armstrongNum(int num1)
	{
		 int d,res,temp;
		 temp=num1;
		   res=0;
		 while(num1!=0)
		 {
		   d=num1%10;
		   res=res+d*d*d;
		 num1=num1/10; 
		 }
		 if(res==temp)
		 System.out.println(" given number is  Armstrong:");
		 else
			 System.out.println(" given number is not  Armstrong:");	 
	  }
	}
	
	

