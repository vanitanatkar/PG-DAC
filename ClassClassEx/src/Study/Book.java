package Study;

public class Book {
	
	
	private String name;
	private int bookcost;
	
	
	Book(){
		bookcost = 500;
		name="learning intropection";
		
	}
	
	@Override
	public String toString() {
		
		return name+" "+bookcost;
	}

}
