package Study;

public class StringTest6 {

	public static void main(String[] args) {
		String s = "hello"; //immutable
		String s1 = s.concat("world");   //this create new string and add previous string
	//	StringBuffer s = new StringBuffer("hello"); //mutable and thread safe
		//StringBuffer s1 = s.append("world"); //this append the String in same String(s) : it's not creating new string

		if(s==s1)   //here we are comparing references 
			System.out.println("they are same");
		else
			System.out.println("they are different");

	}
}
