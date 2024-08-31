public class MobileApp {

	public static void main(String[] args) {
		Mobile m = new Mobile(); // Creating object of Mobile. It creates object of OS automatically.
		// Using data-members and member-functions of Mobile class.
		System.out.println("The mobile brand is " + m.brand);
		System.out.println("The mobile cost is " + m.cost);
		m.chargeMobile();
		// Using data-members and member-functions of OS class THROUGH Mobile class. 
		System.out.println("OS name is " + m.os.name );
		System.out.println("OS version is " + m.os.version );
		m.os.enableWorking();
		
		Charger c = new Charger(); // Creating object of Charger class
		// Using data-members and member-functions of Charger class.
		System.out.println("Charger color is " + c.color);
		System.out.println("Charger output current is " + c.current);
		c.charge();
		
		// Destroying Mobile object. It destroys object of OS automatically
		System.out.println("Mobile is destroyed"); 
		m = null; // Making reference-variable of Mobile point to null
		// Trying to use mobile object again
//		// Using data-members and member-functions of Mobile class.
//		System.out.println("The mobile brand is " + m.brand);
//		System.out.println("The mobile cost is " + m.cost);
//		m.chargeMobile();
//		// Using data-members and member-functions of OS class THROUGH Mobile class. 
//		System.out.println("OS name is " + m.os.name );
//		System.out.println("OS version is " + m.os.version );
//		m.os.enableWorking();
	}

}
