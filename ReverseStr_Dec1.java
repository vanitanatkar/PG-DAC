import java.util.Scanner;
//reverse given string 
/*
public class ReverseStr_Dec1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str=sc.nextLine();
		char []p = str.toCharArray();
      
       
			System.out.print(reverseWords(p));
		}
	
	
	
	//Reverse words in the string ;
	//input: vanita natkar
	//output:atinav raktan
	public static void reverseString(char [] arr) {
		 
		for(int i=0;i<arr.length;i++) {
			StringBuffer sb = new StringBuffer(arr[i]); 
			//System.out.println("string: " + sb);  
			System.out.print( sb.reverse()+" ");
			
		}
	}


//Input: s = “getting good at coding needs a lot of practice” 
//Output: s = “practice of lot a needs coding at good getting” 
//Reverse the letters of the word
static void reverseWord(char str[],
                 int start,
                 int end)
{
// Temporary variable
// to store character
char temp;

while (start <= end)
{
 // Swapping the first
 // and last character
 temp = str[start];
 str[start] = str[end];
 str[end] = temp;
 start++;
 end--;
}
}
//Function to reverse words
static char[] reverseWords(char []s)
{
// Reversing individual words as
// explained in the first step

int start = 0;
for (int end = 0; end < s.length; end++)
{
 // If we see a space, we
 // reverse the previous
 // word (word between
 // the indexes start and end-1
 // i.e., s[start..end-1]
 if (s[end] == ' ')
 {
   reverseWord(s, start, end);
   start = end + 1;
 }
}

// Reverse the last word
reverseWord(s, start, s.length - 1);

// Reverse the entire String
reverseWord(s, 0, s.length - 1);
return s;
}
}
//Driver Code

*/
//reverse the given string without using inbuilt APi in java
import java.util.*;
 
class ReverseStr_Dec1
{
 public static void main(String args[])
 {
                int i,n;
 
 String s;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the string");
 s=sc.nextLine();
 char str[] = s.toCharArray();
     n=str.length;
     System.out.println("Reversed string is");
     for(i=n-1;i>=0;i--)
     {
       System.out.print(str[i]);
     }
 }    
}
