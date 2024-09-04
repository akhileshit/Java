
public class Fan {
	int no_Of_Blades;
	String brand;
	String color;
	int cost;
	
	public void rotate() {
		System.out.println("Fan is Rotating..");
	}
	
	public Fan(int no_Of_Blades, String brand, String color, int cost) {
		this.no_Of_Blades = no_Of_Blades;
		this.brand = brand;
		this.color = color;
		this.cost = cost;
	}
	
	public Fan() {
		
	}
	
	public Fan(int no_Of_Blades, String color) {
		this.no_Of_Blades = no_Of_Blades;
		this.color = color;
	}
}
