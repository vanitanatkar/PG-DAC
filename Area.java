
import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("*****Wel-Come*******");

		while(true)
		{
			System.out.println("Enter your choice:");
			System.out.println("press 1.Area of Circle:");
			System.out.println("press 2.Area of rectangle:");
			System.out.println("press 3.Area of triangle:");
			System.out.println("__________________________");
			int ch =sc.nextInt();
			if(ch>3) {break;}
			switch(ch)
			{
			case 1:
				areaOfCircle(sc);
				break;
			case 2 :
				areaOfRectangle(sc);
				break;
			case 3 :
				areaOfTriangle(sc);
				break;
			}

		}
	}
	public static void areaOfCircle(Scanner sc)
	{	
		System.out.println(" Enter radius of circle ");
		int  r= sc.nextInt();
		double  area =(3.14*r*r);
		System.out.println ( " Area of circle = "  +area );
	}

	public static void areaOfRectangle(Scanner sc)
	{
		System.out.println(" Enter length and width of rectangle: ");
		int len=sc.nextInt();
		int wid=sc.nextInt();

		int area=len*wid;
		System.out.println("Area of rectangle: "+area);

	}
	public static void areaOfTriangle(Scanner sc)
	{
		System.out.println(" Enter base and height of  rectangle: ");
		int b=sc.nextInt();
		int h=sc.nextInt();
		double area=(b*h)/2;
		System.out.println("Area of Trianglt: "+area);

	}

}
