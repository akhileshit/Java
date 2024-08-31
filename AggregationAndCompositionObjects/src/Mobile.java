
public class Mobile {
	String brand = "Samsung";
	int cost = 19999;
	
	void chargeMobile() {
		System.out.println("Charger plugged in and charging....");
	}
	
	// Creating OS class object inside Mobile class (Composition)
	OS os = new OS(); // Composite Object

}
