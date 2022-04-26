import java.util.Scanner;

public class RecursionPPP {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value row: ");
		int n=sc.nextInt();

		printstar(1,n);

	}  
	public static void printstar(int i,int n)
	{

		for(int j=1;j<i;j++)
		{
			System.out.print("*");

		}
		System.out.println();

		if(i<n)
		{
			printstar(i+1,n);
		}

		for(int j=1;j<i;j++)
		{
			System.out.print("*");

		}
		System.out.println();

	}




}
