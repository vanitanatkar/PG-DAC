package Study.HasARelation;

import java.util.Scanner;

public class BookMain {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("How many book you want to store:");
		int size=sc.nextInt();
		Book[] arr= new Book[size];
		populateBook(arr,sc);
		displayBooks(arr);
		while(true)
		{

			showMenu();
			System.out.println("____________________________");
			System.out.println("Enter your choice:");
			int choice=sc.nextInt();
			if(choice>4) {break;}
			switch(choice)
			{
			case 1:
				showSingleBookAuthor(arr);
				break;
			case 2:
				booknameAndCost(arr);
				break;
			case 3:
				allBookCost(arr);
				break;
			case 4:
				allBookandAuthor(arr);
				break;
			}

		}

	}
	public static void populateBook(Book[] arr,Scanner sc)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter Bookname:");
			String bn=sc.next();
			System.out.println("Enter Book Cost:");
			float ct=sc.nextFloat();
			System.out.println("How many author of your book:");
			int s=sc.nextInt();
			String[] brr=new String[s];
			sc.nextLine();
			for(int j=0;j<brr.length;j++)
			{
				System.out.println("Enter Author name:");

				brr[j] = new String(sc.nextLine());
			}
			arr[i]=new Book(bn,ct,brr);
		}


	}
	public static void displayBooks(Book[] arr)
	{
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.println(" "+arr[i].getBookname()+" "+arr[i].getCost()+" "+arr[i].getAuthor());
		}
	}

	public static void showMenu()
	{
		System.out.println("____________________________");
		System.out.println("press 1:To Show all books having single author");
		System.out.println("press 2:To Show all books -  bookname and cost");
		System.out.println("press 3:To Show total cost of all books In the array");
		System.out.println("press 4:To Show only bookname  author1,author2, author for all books");
	}
	public static void showSingleBookAuthor(Book[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i].getAuthor().length <= 1)
			{
				System.out.println(arr[i].getBookname());
			}
		}
	}
	public static void booknameAndCost(Book[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(" "+arr[i].getBookname()+" "+arr[i].getCost());
		}
	}

	public static void allBookCost(Book[] arr)
	{
		float totalcost=0;
		for(int i=0;i<arr.length;i++)
		{
			totalcost=totalcost+arr[i].getCost();
		}
		System.out.println(" "+totalcost);
	}

	public static void allBookandAuthor(Book[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{   
			String [] temp = arr[i].getAuthor();
			System.out.print(" Book Of Name: " + arr[i].getBookname());

			for(int j=0; j<temp.length; j++)
			{
				System.out.print(" Author Name: " + temp[j]);
				
			}
			System.out.println("\n");
		}
		
	}
}
