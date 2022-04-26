package Study;

public class CommandSum {
	public static void main(String[] args) {

		int i,sum=0;
		for(i=0;i<args.length;i++)
		{
			sum=sum+Integer.parseInt(args[i]);
		}
		System.out.println("Sum="+sum);

		/* int a = Integer.parseInt(args[0]);
		        int b = Integer.parseInt(args[1]);
		        int sum = a + b;
		        System.out.println("Sum is " + sum);
		 */
	}
}
/* Assignment Q3
   Accept a few numbers from the command line
	Show the sum of those numbers.
	( concept = command line arguments ,  Integer.parseInt( string) 
 */