package Study.HasARelation;
import java.util.Scanner;
public class UserProduct {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Product p=new Product();
		Product[] arr=new Product[2];
		populate(arr,sc);
		print(arr);
		purchaseProduct(arr,sc);

	}


	public static void populate(Product[] arr,Scanner sc)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter product name:");
			String pn=sc.next();
			System.out.println("Enter product description:");
			String dec=sc.next();
			System.out.println("Enter product Cost:");
			int ct=sc.nextInt();
			System.out.println("Enter date:");
			int d=sc.nextInt();
			System.out.println("Enter month:");
			int m=sc.nextInt();
			System.out.println("Enter year less than 2022:");
			int y=sc.nextInt();
			MyDate date=new MyDate(d,m,y);

			arr[i]=new Product(pn,dec,ct,date);

		}
	}
	public static void print(Product[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	public static void purchaseProduct(Product[] arr,Scanner sc)
	{     

		System.out.println("________________________________________");
		System.out.println("Enter which product you want to buy:");
		String name=sc.next();
		System.out.println("Enter Quantity you want to buy:");
		int qty=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i].getDOE().getYear()>=2020 && arr[i].getDOE().getYear()<=2021)
			{
				if(arr[i].getProductname().equals(name))
				{
					System.out.println("__________________________________");
					System.out.println("Product bill:");
					System.out.println("Product name:"+arr[i].getProductname());
					System.out.println("Product descriptio:"+arr[i].getDescription());
					System.out.println("Product cost:"+arr[i].getCost());
					float totalCost=(arr[i].getCost()*qty);
					System.out.println("Product total cost:"+totalCost);
				}
			}
			else
				System.err.println(" product has crossed expiry date , we cannot sell it :");
		}
	}
}

