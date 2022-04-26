package Study.Interface;

import java.util.Scanner;

import Study.Abstract.Dresses;
import Study.Abstract.Product;
import Study.Abstract.Toy;

public class UserSellable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("how many product you want to store:");
		int size=sc.nextInt();
		Sellable []arr = new Sellable[size];
		populateSellable(arr,sc);
		showDetails(arr);
		showSellingPrice(arr);
	}
	public static void showSellingPrice(Sellable[] arr)  
	{
		for(int i =0; i<arr.length; i++)
		{
			System.out.println("Sellable "+(i+1));
			if(arr[i] instanceof CompactDisc)
			{
				System.out.print("Compact Disc Selling Price="+arr[i].getSellingPrice());
				System.out.println("");
			}

			if(arr[i] instanceof Laptop)
			{
				System.out.print("Laptop Selling Price=  "+arr[i].getSellingPrice());
				System.out.println("");
			}
			System.out.println("");
		}
		System.out.println("_____________________________________________________");
	}
	public static void populateSellable(Sellable[] arr,Scanner sc) {

		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter 1 for CD,Enter 2 for Laptop and Enter 0  to quit");
			int choice=sc.nextInt();
	          if(choice==0) {break;}
				if(choice==1)
				{
					System.out.println(" Enter CD name:");
					String name=sc.next();
					System.out.println(" Enter Stoarage format Mp4 or mp3:");
					String format=sc.next();
					System.out.println(" Enter cost:");
					float cost=sc.nextInt();
					System.out.println(" Enter artist:");
					String artist=sc.next();
					arr[i] = new CompactDisc(name,format,cost,artist);
				}
				if(choice==2)
				{
					System.out.println("Enter Brand of laptop");
					String brand=sc.next();
					System.out.println("Enter RAM size in GB");
					int RAM=sc.nextInt();
					System.out.println("Enter display details:");
					String display=sc.next();
					System.out.println("Enter colour  details:");
					String color=sc.next();
					System.out.println("Enter price of laptop:");
					double price=sc.nextDouble();

					arr[i]=new Laptop(brand,RAM,display,color,price);
				}
			
			System.out.println("_____________________________________________________");
		}
	}

	public static void showDetails(Sellable[] arr) {

		for(int k=0;k<arr.length;k++) {

			System.out.println(arr[k]);
			System.out.println("_____________________________________________________");
		}
	}
}

