import java.util.Scanner;

//Write a program to convert first character of each word of a user input string into upper case.

public class Upcase { 
	public static void main(String[] args) {  
	    System.out.println(Upcase.capitalizeWord("my name is khan"));  
	    System.out.println(Upcase.capitalizeWord("I am sonoo jaiswal"));  
	    System.out.println("enter String");
	    Scanner sc= new Scanner(System.in);
	    String str= sc.nextLine();
	    System.out.println(" "+capitalizeWord(str));
	    
	    } 
public static String capitalizeWord(String str){  
    String words[]=str.split("\\s");  
    String temp="";  
    for(String w:words){  
        String first=w.substring(0,1);  
        String afterfirst=w.substring(1);  
        temp=temp+first.toUpperCase()+afterfirst+" ";   //this black space for space between two words
    }  
    return temp;  
}  
}  
 















/*
public class Upcase 
{
	String []arr;

	Upcase(char size)
	{
		arr=new String [size];
	}

	public void SplitString()
	{
		int i;	
		String temp = " ";
		String first = " ",rem = " ";

		for(i=0;i<arr.length; i++)
		{
			first = arr[i].substring(0, 1);
			rem = arr[i].substring(1);
			temp = temp + first.toUpperCase()+ rem + " ";
		}              
		System.out.println(temp);
	}



}*/


