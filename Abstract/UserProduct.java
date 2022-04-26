package Study.Abstract;

import java.util.Scanner;

import Study.Interface.Sellable;

public class UserProduct {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter how many product you want to store:");
		int size=sc.nextInt();
		Product []Shopping = new Product[size];
		populateProduct(Shopping,sc);
		showDetails(Shopping);
		showBill(Shopping);

	}
	public static void showBill(Product[] shopping)   //private meaning here
	{
		double total = 0;

		for(int i =0; i<shopping.length; i++)
		{
			System.out.println("Product "+(i+1));
			if(shopping[i] instanceof Toy)
			{
				System.out.print("Discount="+shopping[i].getDesc()+"  And FinalCost="+shopping[i].getFinalCost());
				System.out.println("");
				total = total + shopping[i].getFinalCost();
			}

			if(shopping[i] instanceof Dresses)
			{
				System.out.print("Discount"+shopping[i].getDesc()+"  And FinalCost=  "+shopping[i].getFinalCost());
				System.out.println("");
				total = total + shopping[i].getFinalCost();
			}
			System.out.println("");
		}
		System.out.println("Shopping Bill total cost =  "+total);
		System.out.println("____________________________________");

	}

	public static void  populateProduct(Product[] shopping,Scanner sc) {
		for(int i=0;i<shopping.length;i++) {
			System.out.println("Enter 1 for Toy and Enter 2 for Dresses");
			int choice=sc.nextInt();
			for(int j=1;j<2;j++)
			{
				if(choice==1)
				{
					System.out.println("Enter Toy name:");
					String name=sc.next();
					System.out.println("Enter toy category:");
					String cat=sc.next();
					System.out.println("Enter cost:");
					int cost=sc.nextInt();
					shopping[i]=new Toy(name,cat,cost);
				}
				if(choice==2)
				{
					System.out.println("Enter dress name:");
					String name=sc.next();
					System.out.println("Enter material type:");
					String material=sc.next();
					System.out.println("Enter size of dress:");
					char size=sc.next().charAt(0);
					System.out.println("Enter price of dress:");
					float price=sc.nextFloat();
					shopping[i]=new Dresses(name,material,size,price);
				}
			}
			System.out.println("______________________________________");
		} 
	}
	public static void showDetails(Product[] arr) {

		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
			System.out.println("_______________________________________");
		}
	}

}



