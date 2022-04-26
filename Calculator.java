
public class Calculator {
	public int num1;
	public int num2;


	public Calculator()
	{
		num1=0;
		num2=0;

	}
	public Calculator(int n1,int n2)
	{
		num1=n1;
		num2=n2;

	}

	public void add(int num1,int num2)
	{ 
		int sum=num1+num2;
		System.out.println("Addition="+sum);
	}

	public void sub(int num1,int num2)
	{
		int sub=num1-num2;
		System.out.println("Subtraction="+sub);
	}

	public void mul(int num1,int num2)
	{
		int  mul=num1*num2;
		System.out.println("Multiplication="+mul);	 
	} 

	public void div(int num1,int num2)
	{
		int div=num1/num2;
		System.out.println("Division="+div);	 
	}  


	public String toString()
	{
		String str = " num1:"+num1+",num2:"+num2;
		return str;
	}

}



