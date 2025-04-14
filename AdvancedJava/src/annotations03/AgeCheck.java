package annotations03;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.LOCAL_VARIABLE})
public @interface AgeCheck {  // Defining the Custom Annotation
	
	String message();
	int minvalue();
}


// @Retention, @Target are called meta-annotations  (annotations for annotations!!)