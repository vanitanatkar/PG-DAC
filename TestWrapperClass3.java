package Study;



public class TestWrapperClass3 {
	public static void main(String[] args) {

		Wrapper num1 = new Wrapper();
		Wrapper num2 = new Wrapper();
		num1.value=10;
		num2.value=20;
		System.out.println("Before swap num1= "+num1.value+"  num2="+num2.value);
		swap(num1,num2);
		System.out.println("After swap num1= "+num1.value+"  num2="+num2.value);

	}//main end
		public static void swap(Wrapper num1,Wrapper num2)
		{
			int temp=num1.value;
			num1.value = num2.value;
			num2.value=temp;

		} 
	

}//class end

class Wrapper
{
	int value;
}






