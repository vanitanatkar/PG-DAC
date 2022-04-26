import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx2_Dec1 {
	
	
	public static void main(String[] args) {
		//write a program that takes two string from user and determine if they are anagram of the other or not..
		//two words are called as anagram when second word is made after rearranging character of first word.
		//for ex: "cat " and "tac" ;  "dog" and "god" are anagram..
	

       System.out.println("Enter fist String");
       Scanner sc= new Scanner(System.in);
       String str1 = sc.next();
       char arr1[] = str1.toCharArray();
       System.out.println("Enter second String");
       String str2=sc.next();
       char arr2[] = str2.toCharArray();
       
        // Function Call
        if (areAnagram(arr1, arr2))
            System.out.println("The two strings are"
                               + " anagram of each other");
        else
            System.out.println("The two strings are not"
                               + " anagram of each other");
	}
		
		 
		    /* function to check whether two strings are
		    anagram of each other */
		    public static boolean areAnagram(char [] arr1, char [] arr2)
		    {
		        // Get lengths of both strings
		        int n1 = arr1.length;
		        int n2 = arr2.length;
		 
		        // If length of both strings is not same,
		        // then they cannot be anagram
		        if (n1 != n2)
		            return false;
		           
		 
		        // Sort both strings
		       
		       Arrays.sort(arr1);
		        Arrays.sort(arr2);
		 
		        // Compare sorted strings
		        for (int i = 0; i < n1; i++)
		            if (arr1[i] != arr2[i])
		                return false;
		 
		        return true;
	 	    }
}
		 
		

		 
		
		
	

