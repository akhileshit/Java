
public class RobotApp { // Overriding

	public static void main(String[] args) {
		DoctorRobot dr = new DoctorRobot();
		dr.talk();
		dr.charge();
		dr.walk();
		dr.doSurgery();
		dr.giveMedicines();
		
		System.out.println("-----------------------------------");
		
		CleanerRobot cl = new CleanerRobot();
		cl.talk();
		cl.charge();
		cl.walk();
		cl.cleanHouse();
		cl.cleanUtensils();

	}

}
