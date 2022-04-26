package Study.Generics;

import Study.HasARelation.MyDate;

public class UserArrayList {
		public static void main(String[] args) {
			MyGenericStack<MyDate> stack = new MyGenericStack<MyDate>(new MyDate[3]);
			
			
			stack.push(new MyDate(12,12,2021));
			stack.push(new MyDate(1,1,2020));
			stack.push(new MyDate(12,12,1921));
			
			
			try {
			System.out.println(stack.pop().getYear());
			}
			catch(NullPointerException a)
			{
				System.out.println("nothing in stack");
			}
		}
	}


