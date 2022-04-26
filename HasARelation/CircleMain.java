package Study.HasARelation;
import java.util.Scanner;
public class CircleMain {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		//Circle obj = new Circle(4, new Point(3,4));

		Circle[] arr =new Circle[2];

		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter radius of Circle:");
			int radius=sc.nextInt();
			System.out.println("Enter x :");
			int x=sc.nextInt();
			System.out.println("Enter y:");
			int y=sc.nextInt();
			Point p= new Point(x,y);
			arr[i]=new Circle(radius,p);
		}
		while(true)
		{
			System.out.println("_________________________");
			menu();
			System.out.println("Enter your choice:");
			int choice=sc.nextInt();
			if(choice>3) {break;}
			switch(choice) {
			case 1:
				showRadius(arr);
				break;
			case 2:
				AccYcoordinator(arr);
				break;

			case 3:
				showYcoordinator(arr);
				break;
			}
		}

	}

	public static void menu()
	{
		System.out.println("press 1:Show only radius of all circles in the array ");
		System.out.println("press 2:Show the centers and radii of all circles whose y coordinate is between 10 and 90");
		System.out.println("press 3:Show only y coordinates of all circles");
		System.out.println("Enter 4 to quit:");
	}


	public static void showRadius(Circle[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i].getRadius());
		}

	}

	public static void AccYcoordinator(Circle[] arr) {

		for(int i=0;i<arr.length;i++)
		{
			int temp=arr[i].getCenter().getY();

			if((temp>10) && (temp<90))
			{

				System.out.println(arr[i].getRadius()+" "+arr[i].getCenter().getX()+" "+arr[i].getCenter().getY());
			}

		}
	}

	public static void showYcoordinator(Circle[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].getCenter().getY()+"  ");
		}
	}
}
