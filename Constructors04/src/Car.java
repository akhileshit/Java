
public class Car { 
	String color;
	String brand;
	int cost;
	
	public Car(String color, String brand, int cost) {
		this.color = color;
		this.brand = brand;
		this.cost = cost;
	}
	
	void display() {
		System.out.println("Car color " + color + " Car brand " + brand + " Car cost " + cost);
	}
}
