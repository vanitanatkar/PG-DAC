package Study;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.Signer;
import java.util.Scanner;

public class TestClassClass {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//Class obj = java.lang.Thread.class;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a class name");
		String cname = sc.next();
		
		//cname obj = new cname(); this is not possible as the classname is not known
		Class obj = Class.forName(cname);
		System.out.println(obj.newInstance()); //by using this we can create object ,here default constructor called
		
		
		
		//at consol give java.util.GregorianCalendar
		//java.util.ArrayList
		showInfo(obj);
	}
	
	
	public static void showInfo(Class cobj) {
		
		//show the fields of this class
		
		Field[] fields = cobj.getFields();
		
		for(Field f : fields) {
			
			System.out.println(f.getName());
			System.out.println(f.getType());
			
			int modifiers = f.getModifiers();
			
			System.out.println(Modifier.toString(modifiers) );
			
		}
		
		System.out.println("Method Summery");
		Method[] method = cobj.getMethods();
		
		for(Method m : method)
			System.out.println(m.getName());
		//java.util.ArrayList
		
		
	}

}
