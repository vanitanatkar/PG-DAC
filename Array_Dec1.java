//search students those having 70 marks in array;
public class Array_Dec1 {
	public static void main(String[] args) {
		
		int []input= { 31 ,35 ,35,40,42,50,66,70,70,70,78,78,85,85,88,90,90};
		int key=70;
		int  count;
		count=searchMarks(input,key);
		if(count==0)
			System.out.println("Not Found");
		else 
			System.out.println(count + "students");

	}

	public static int searchMarks(int []input , int key)
	{
		int low,high,mid,count=0;
		low=0;
		high=input.length;
		mid=(low+high)/2;
		while(low<high){
			if(input[mid]>key)
			{high=mid-1;
			
			}
			else {
				low=mid+1;
				mid=(low+high)/2;
			}
			if(input[mid]==key){
				count++;
				low=mid-1;
				while((low>=0)&&(input[low]==key)){
					count++;low--;
				}
				high=mid+1;
				while((high<input.length)&&(input[high]==key)){count++; high++;
				}
			}
		}
		return count;
	}//end of class
}//end of class


