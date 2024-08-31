
public class Main {

	public static void main(String[] args) {
		Animal animal;
		animal = new Monkey(); // Up-casting
		habits(animal); // Polymorphism
		
		animal = new Tiger(); // Up-casting
		habits(animal); // Polymorphism
		
		animal = new Deer(); // Up-casting
		habits(animal); // Polymorphism
	}
	
	static void habits(Animal animal) { // Code re-use and Polymorphism
		animal.eat();
		animal.sleeping();
		animal.foodHabit();
	}

}
