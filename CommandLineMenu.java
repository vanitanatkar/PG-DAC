package Study;

public class CommandLineMenu {
	public static void main(String[] args) {

		while(true)
		{
			System.out.println(args[0]);

			if(args[0].charAt(0)== '1')
			{  
				int mul;
				for(int j=1;j<=50;j++)
				{
					mul= 2*j;
				System.out.println(" "+mul);
				}
				break;
			}
			else if(args[0].charAt(0)=='2')
			{
				System.out.println("Poem: We Exits in moments,nothing more...");
				break;
			}
			else if(args[0].charAt(0)=='3')
			{
				System.out.println("you are enter 3 as argument:");
				break;
			}
			else
			{
				System.out.println("Please enter 1/2/3 as argument:");
				break;
			}
		}
	}

}
