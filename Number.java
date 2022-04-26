public class Number
{

	private int num;
	
	public Number(){
		num=0;
	}
	
	public Number(int num1)
	{
		num = num1;
	}
	public void setNum(int num1)
	{
		num = num1;
	}
	
	public int getNum()
	{
		return num;
	}
	
	public String toString()
	{
		String str = "Num=" + num;
		return str;
	}
}

