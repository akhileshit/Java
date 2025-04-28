package reflections;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import reflections.Emp.MyAnnore;

public class Demo { // Accessing fields,methods,Annotations,constructor,class data using Reflections
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
		
		Class c = Class.forName("reflections.Emp");
		
		// Constructor Array
		Constructor[] constructors = c.getDeclaredConstructors();
		for (Constructor constructor: constructors) {
			System.out.println("Name of the Constructor: " + constructor);
			System.out.println("Count of Constructor parameter: " + constructor.getParameterCount());
			Parameter[] parameters = constructor.getParameters();
			for(Parameter parameter: parameters) {
				System.out.println("Constructor's Parameter: " + parameter);
			}
			System.out.println();
		}
		System.out.println("*********************");
		
		// Method Array
		Method[] methods = c.getDeclaredMethods();
		System.out.println("#Methods: " + methods.length);
		for (Method method: methods) {
			System.out.println("Method Name: " + method);
			System.out.println("Method return type: " + method.getReturnType());
			// for Annotations
			System.out.println(method.isAnnotationPresent(MyAnnore.class));
			if (method.isAnnotationPresent(MyAnnore.class)) {
				MyAnnore anno = method.getAnnotation(MyAnnore.class);
				Annotation[] annotations = method.getDeclaredAnnotations();
				for(Annotation a : annotations) {
					System.out.println(a);
				}
				System.out.println(anno.hello());
			}
			System.out.println("Method parameter count: " + method.getParameterCount());
			Parameter[] parameters = method.getParameters();
			for(Parameter parameter: parameters) {
				System.out.println("Method's Parameter: " + parameter);
			}
			System.out.println();
		}
		System.out.println("*********************");
		
		// Class Array
		Class[] classes = c.getDeclaredClasses(); // includes enums, interfaces
		for (Class classs: classes) {
			System.out.println("Class: " + classs);
			System.out.println("Name of the Class: " + classs.getName());
			System.out.println();
		}
		
		System.out.println("*********************");

		// Fields Array
		Field[] fields = c.getDeclaredFields();
//		Emp e = new Emp();
		for (Field field: fields) {
			System.out.println("Field: " +  field );
			if (field.isAnnotationPresent(MyAnnore.class)) {
				MyAnnore ma = field.getAnnotation(MyAnnore.class);
				System.out.println("Annotation value: " + ma.hello());
//				field.setAccessible(true);
//				field.set(e, "j");
//				System.out.println(field.get(e)); 
			}
		}

	}
}
