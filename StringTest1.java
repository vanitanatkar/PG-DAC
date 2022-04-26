package Study;

public class StringTest1 {

	public static void main(String[] args) {
//create 5 string objects using following 4 constructors from Javadocs 	
     /*
		//String();
		String s1=new String();
		System.out.println(s1);

		//String(String);
		String s2 = new String("Hello");
		System.out.println(s2);

		//String(char[])
		char ch[ ] = { 'a', 'b', 'c', 'd' };
		String s3 = new String(ch);
		System.out.println(s3);

		//String(char[ ],offset,count);
		char arr[] = { 'a', 'e', 'i', 'o', 'u'}; 
		String s4 = new String(arr, 1,3); 
		System.out.println(s4); */
		
		String s1= new String();
		System.out.println(s1);
		
		String s2=new String("Vanita");
		System.out.println(s2);
		
		char ch[]= {'a','b','c','d','E'};
		String s3=new String(ch);
		System.out.println(s3);
		
		char arr[] = {'a','w','t','y','z'};
		String s4=new String(ch,1,3);
		System.out.println(s4);
	}

}



