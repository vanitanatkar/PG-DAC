package Study.Generics;

public class UserGenericStack {
		public static void main(String[] args) {
			MyGenericStack<Integer> stack = new MyGenericStack<>(new Integer[5]);
			
			stack.push(10);  //int,autoboxing ->Integer is a Object 
			stack.push(50);
			//stack.push(new MyDate(12,12,1212));
			//stack.push("lalala");
			stack.push(80);
			
			//pop an element and show its square
			while(true)
			{
				try {
				int x = stack.pop();
				System.out.println(x*x);
				}
				catch(NullPointerException npe)
				{
					System.out.println("stack empty");
					break;
				}
			}
		}

		}

//here array size must give
//here T type is integer so that it can accept only integer value 

