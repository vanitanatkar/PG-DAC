import java.util.Arrays;
import java.util.Scanner;

public class RemoveDublicateStr {


	// Java program to remove duplicate character from character array and print 
	 
	
	   public static void main(String[] args)
	    {
		   System.out.println("Enter String:");
		   Scanner sc= new Scanner(System.in);
		   String str= sc.nextLine();
		   
	        char arr [] = str.toCharArray();
	        int n = arr.length;
	       removeDuplicate(arr, n);
	    }

	   public static void removeDuplicate(char str[], int n)
	    {
		   int index = 0;   
		    
	        // Traversing character array   
	        for (int i = 0; i < n; i++)   
	        {   
	              
	            // Check whether str[i] is present before or not   
	            int j;   
	            for (j = 0; j < i; j++)    
	            {   
	                if (str[i] == str[j])   
	                {   
	                    break;   
	                }   
	            }   
	    
	            // If the character is not present before, add it to resulting string   
	            if (j == i)    
	            {   
	                str[index++] = str[i];   
	            }   
	        }   
	        
	        System.out.println(String.valueOf(Arrays.copyOf(str, index)));
	    }
	 
	}//clas end
	 

	