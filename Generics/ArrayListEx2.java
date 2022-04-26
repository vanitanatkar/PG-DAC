package Study.Generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class ArrayListEx2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		List<Integer> mylist=new ArrayList<Integer>();     // for ArrayList 
		//List<Integer> mylist=new LinkedList<Integer>();  //for LinkList
		//List<Integer> mylist=new Stack<Integer>();        //for Stack
		//List<Integer> mylist=new Vector<Integer>();      //for vector....Like an array
		while(true) {
			showMenu();
			System.out.println("Enter your Choice");
			int choice=sc.nextInt();
			if(choice>=5)
			{System.out.println("Invalid choice:");
			break;}
			switch(choice) {
			case 1:
				populateArrayList(mylist,sc);
				break;
			case 2:
				displayArrayList(mylist);
				break;
			case 3:
				additionOfArrayList(mylist);
				break;
			case 4:
				removeIndex_ValueInArrayList(mylist,sc);
				break;

			}//switch case End
		}//while end

	}//main end

	private static void showMenu() {
		System.out.println("__________MENU_______________");
		System.out.println("1.Insert a number to list");
		System.out.println("2.Display all Array elements");
		System.out.println("3.Summation of all elements");
		System.out.println("4.Delete a element");
		System.out.println("5.Exit");
	}

	public static void populateArrayList(List<Integer>mylist, Scanner sc) {

		while(true) {
			System.out.println("__________PopulateArrayList____________");
			System.out.println("Press 1 for Insert");
			System.out.println("Press 2 for Append");
			System.out.println("Press 3 for Quit");
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			if(ch==1) //if(str.equalsIgnoreCase("Insert"))
			{
				System.out.println("Enter Index and value:");
				int Index=sc.nextInt();
				int value=sc.nextInt();
				mylist.add(Index,value);
			}
			if(ch==2) {
				System.out.println(" Enter the Value");
				int value = sc.nextInt();
				mylist.add(value);
			}
			if(ch==3) {
				break;
			}

		}
	}
	public static void displayArrayList(List<Integer>mylist) {
		System.out.println("____________ArrayList_____________");
		for(int i=0;i<mylist.size();i++) {
			System.out.println("\t"+mylist.get(i));
		}
	}
	public static void additionOfArrayList(List<Integer>mylist) {
		System.out.println("____________ ADDITION __________ ");
		int sum=0;
		for(int i=0; i<mylist.size(); i++)
		{
			sum = sum + mylist.get(i);   
		}
		System.out.println(" Sum= " +sum); 
	}
	public static void removeIndex_ValueInArrayList(List<Integer>mylist,Scanner sc)
	{
		boolean run = true;
		while(run)
		{
			System.out.println("1.Remove by number");
			System.out.println("2.Remove by index");
			System.out.println("What do you want?");
			int choice = sc.nextInt();
			/*ArrayList#remove(Object) that takes an Object to remove, and
			  ArrayList#remove(int) that takes an index to remove.*/
			switch(choice)
			{
			case 1:
				System.out.println("Enter the number to be remove: ");
				int number = sc.nextInt();
				//myarray.remove((Integer) number);
				mylist.remove(Integer.valueOf(number));
				System.out.println("Removed number successfully");
				break;

			case 2:
				System.out.println("Enter the index to be remove: ");
				int index = sc.nextInt();
				mylist.remove(index);
				System.out.println("Removed index successfully");
				break;

			}
			System.out.println("Do you want to continue[Y/N]: ");
			char result = sc.next().charAt(0);
			if(result==('y') || result==('Y') )
			{
				run = true;
			}
			else 
				run = false;

		}
	}

}//class end
