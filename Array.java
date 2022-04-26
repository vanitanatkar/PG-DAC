
import java.util.Scanner;

public class Array
{
	public static void main ( String  [] args)
	{
		int i,sum,size;
		System.out.println("********Wel-Come********");
		Scanner s = new Scanner (System.in);
		System.out.println ( "Enter how many element you want to store" );
		size= s.nextInt();
		int [] arr = new int[ size];
		int [] brr = new int [arr.length+size];

		System.out.println("Enter elements of the array arr:");  
		for( i=0; i<size; i++) 
		{
			arr[i]= s.nextInt();
		}  
		System.out.println("Enter elements of the array brr:");  
		for(  int j=0; j<brr.length; j++) 
		{
			brr[j]= s.nextInt();
		}  
		
		while(true)
		{
			System.out.println("_________________________");
			System.out.println("press 1. to print array:");
			System.out.println("press 2. to reverse array:");
			System.out.println("press 3. to Sum of array element::");
			System.out.println("press 4. copy array:");
			System.out.println("press 5. to concate array:");
			System.out.println("press 6 to exit:");

			System.out.println("Enter your choice:");
			int ch=s.nextInt();
			if(ch>5) {break;}
			switch(ch)
			{
			case 1:
				printArray(arr);
				break;
			case 2 :
				reverseArray(arr);
				break;
			case 3 :
				arraySum(arr);
				break;
			case 4 :
				copyArray(arr,brr);
				break;
			case 5 :
				concateArray(arr,brr);
				break;                           		   
			}
		}
	}
		public static void printArray(int arr [])
		{
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(" "+arr[i]);
			}
		}
		public static void reverseArray(int arr[])
		{
			for ( int i = arr.length-1 ; i>= 0; i--)
				System.out.print(arr[i] + " ");       
		}
		public static void arraySum(int arr[] )
		{
			int sum=0;
			for (int i=0; i<arr.length; i++)   
			{  
				sum =sum+arr[i];
			}
			System.out.println(" Sum of array element : "+sum);
		}
		public static void copyArray(int arr[],int brr [])
		{

			for(int i=0;i<arr.length;i++)
			{
				brr[i]=arr[i];
			}
			for(int i=0;i<brr.length;i++)
			{
				System.out.println(" "+brr[i]);
			}

		}
		public static void concateArray(int arr[] , int brr[]) {
		
			int k=0;
			while(brr[k]  != '\0' )
			{
				k++;
			}
			for(int i=0;i<arr.length;i++) 
			{
				brr[k]=arr[i];
				k++;
			}
			System.out.println(" "+brr[k]);
		
		}

}	
		/* ___revere into same array______
 public static void reverse(int arr[])
 {
 for(int f=0,e=arr.length-1;f<e;f++,e--){
 int temp=arr[f];
 arr[f]=arr[e];
 arr[e]=temp;
 }
 
 
		 */

	

