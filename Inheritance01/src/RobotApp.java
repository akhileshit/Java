
public class RobotApp {

	public static void main(String[] args) {
		DoctorRobot dr = new DoctorRobot();
		dr.talk();
		dr.walk();
		dr.charge();
		dr.doSurgery();
		dr.giveMedicines();
		
		System.out.println("-----------------------------------");
		
		CleanerRobot cl = new CleanerRobot();
		cl.talk();
		cl.walk();
		cl.charge();
		cl.cleanHouse();
		cl.cleanUtensils();

	}

}
