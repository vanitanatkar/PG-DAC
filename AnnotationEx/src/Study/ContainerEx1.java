package Study;

import java.lang.reflect.Method;
import java.sql.Date;

import Study.Example.MyUtilityClass;

public class ContainerEx1 {
	public static void main(String[] args) {
		Class obj = new MyUtilityClass().getClass();
		
		Method[] meth = obj.getMethods();
		
		for(Method m : meth) {
			if(m.isAnnotationPresent(RedSticker.class))
			{
				//System.out.println(new Date());
				//m.invoke(new MyUtilityClass() ,null);
				//those method name we dont know we can call them by using invoke
			}
		//	else 
			//	m.invoke(new MyUtilityClass(), null);
			
		}
		
	}

}
