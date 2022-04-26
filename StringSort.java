
public class StringSort {
	//Java program to Sort a String Alphabetically
	// Using toCharArray() method
	// Without using sort() method
	//Selection Sort logic as below

	    public static void main(String[] args) throws Exception
	    {
	        // Custom string input
	        String str = "stringinalp";
	        char [] arr=str.toCharArray();
	       
	        sortString(arr);
	        
	    }
	    public static void sortString(char [] a) {
	        for(int i=0;i<a.length;i++){
	       		
	       		int min=i;
	       			
	       		for(int j=i+1;j<=a.length-1;j++)
	       		{	
	       			if(a[j] < a[min])
	       			{
	       				min=j;
	       			}
	       		}	
	       			char temp=a[i];			
	       			a[i]=a[min];
	       			a[min]=temp;
	       }
	        System.out.println(a);
	    }
	}

 