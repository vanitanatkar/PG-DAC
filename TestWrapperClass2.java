package Study;

public class TestWrapperClass2 {

		public static void main(String[] args) {
			
			// Integer x = 33;
			MyWrapper y = new MyWrapper();
			//y.value = 33;
		    //int y =33;
			System.out.println(y.value);
			increment(y);
			System.out.println(y.value);
		}
		
		public static void increment(Integer x)
		{
			x=x+1; //boxing + AutoBoxing
		}

	   public static void increment(MyWrapper y)
		{
			y.value = y.value +1;
		}
	}


	class MyWrapper
	{
		int value;
	}
	

	

