package Study;

public class StringTest2 {
	public static void main(String[] args) {
		
	
		String s1 ="Java";
		String s2 ="CoreJava";
		String s3 =new String("Java");
		
		if(s1.equals(s2))
		    System.out.println("Address of String s1 and s2 are same ");
		else
			System.out.println("Address of String s1 and s2 are different ");
		
		if(s1.equals(s3))
		    System.out.println("Address of String s1 and s3 are same ");
		else
			System.out.println("Address of String s1 and s3 are different ");
	}

}
