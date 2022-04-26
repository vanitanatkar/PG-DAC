

public class Recursuinp {

	public static void main(String[] args) {

		printstar(1);

	}

	public static void printstar(int i)
	{
		for(int j=0;j<i;j++)
		{
			System.out.print(""+i);
		}

		System.out.println();

		if(i<4)
		{
			printstar(1+i);
		}
		
		for(int j=0;j<i-1;j++)
		{
			System.out.print(""+(i-1));
		}
		System.out.println();

	}     

}
