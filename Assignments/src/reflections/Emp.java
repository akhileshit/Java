package reflections;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

public class Emp {
	
	private int id;
	@MyAnnore
	private String name;
	private double sal;
	
	enum week {
		SUN, TUE, WED
	}
	
	@Retention(RetentionPolicy.RUNTIME)  // Accessible through Reflections
	@interface MyAnnore{
		String hello() default "Hey" ;
	}

	@MyAnnore
	public int getId() {
		return id;
	}

	public void setId(int id, String data1, float data2) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public Emp(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public Emp() {
		
	}
	
	class A {
		
	}
	
	class B {
		
	}
	
}
