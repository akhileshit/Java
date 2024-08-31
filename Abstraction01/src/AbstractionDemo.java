
public class AbstractionDemo {

	public static void main(String[] args) {
		Parent ref;
		ref = new Child1();
		ref.eat();
		ref.sleep();
		ref.cry();
		
		ref = new Child2();
		ref.eat();
		ref.sleep();
		ref.cry();
		
		ref = new Child3();
		ref.eat();
		ref.sleep();
		ref.cry();
		
		
	}

}
