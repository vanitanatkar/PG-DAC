public class Vowels{
	public static int a=0;
	public static int e=0;
	public static int i=0;
	public static int o=0;
	public static int u=0;



	public static void vowels(String str) {
		for (int j=0;j<str.length();j++)
		{
			if(str.charAt(j)=='a' || str.charAt(j)=='A')
			{
				a++;

			}

			if(str.charAt(j)=='e' || str.charAt(j)=='E')
			{
				e++;

			}

			if(str.charAt(j)=='i' || str.charAt(j)=='I')
			{

				i++;


			}

			if(str.charAt(j)=='o' || str.charAt(j)=='O')
			{

				o++;

			}

			if(str.charAt(j)=='u' || str.charAt(j)=='U')
			{

				u++;


			}

		}

		//System.out.println(""+a +""+e +""+i+""+o+""+u);


	}

	public static void print() {

		//A
		if(a>0)
		{
			System.out.print("a ");
			for(int j=0;j<a;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		//e
		if(e>0)
		{
			System.out.print("e ");
			for(int j=0;j<e;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		//i
		if(i>0)
		{
			System.out.print("i ");
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		//o
		if(o>0)
		{
			System.out.print("o ");
			for(int j=0;j<o;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		//u
		if(u>0)
		{
			System.out.print("u ");
			for(int j=0;j<u;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}


	}

}


