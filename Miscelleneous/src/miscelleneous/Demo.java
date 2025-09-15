package miscelleneous;

public interface Demo {
	
	String RANDOM_STRING = "Hello"; // can only have public-static-final field => (CONSTANT). By default "public", "static" and "final"
	
	public static void hello() {
		System.out.println("This message is from the static method of an interface");
		secretHello();
	}
	
	public default void hello2() {
		System.out.println("This message is from the default method");
		secretHello();
	}
	
	void hii();  // By default "public" and "abstract"
	
	
	private static void secretHello() {
		System.out.println("This message is from the private method of an interface");
	}
	
	public static void main(String[] args) {  // Even main method!! WTF!! . Because is just another static mehtod!!
		System.out.println(Demo.RANDOM_STRING);
		
		Demo.hello();
	}
	
}
