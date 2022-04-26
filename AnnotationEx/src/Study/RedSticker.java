package Study;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.FIELD})  //further annotation on the basis of method
@Retention(RetentionPolicy.RUNTIME)  //runtime means End tak rehega
public @interface RedSticker {
	
	

}
