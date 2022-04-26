import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many prime number you want:");
		int num=sc.nextInt();

		primenum(num);


	}

	public static void primenum(int num)
	{
		int i=2,j,count=0;

		for(i=1;i<num;i++)
		{
			count=0;
			for(j=1;j<i;j++)
			{
				if(i%j==0)
					count++;
				
			}
			if(count==2)

				System.out.println(i+" ");


		} 

	}

}


