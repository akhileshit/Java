
public class FanApp { // Constructors with different parameters
	public static void main(String[] args) {
		Fan fan = new Fan(4, "USHA", "White", 2000);
		System.out.println(fan.no_Of_Blades);
		System.out.println(fan.brand);
		System.out.println(fan.color);
		System.out.println(fan.cost);
		
		System.out.println("=============================");
		
		Fan fan2 = new Fan();
		System.out.println(fan2.no_Of_Blades);
		System.out.println(fan2.brand);
		System.out.println(fan2.color);
		System.out.println(fan2.cost);
		
		System.out.println("=============================");
		
		Fan fan3 = new Fan(5, "White");
		System.out.println(fan3.no_Of_Blades);
		System.out.println(fan3.brand);
		System.out.println(fan3.color);
		System.out.println(fan3.cost);
	}
}
