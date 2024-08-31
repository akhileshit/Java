
class VehicleApp {
	public static void main(String[] args) {
		Car cr = new Car();
		cr.speed = 180;
		cr.wheels = 4;
		cr.start();
		cr.accelerate();
		System.out.println("Total #wheels: "+ cr.wheels);
		System.out.println("Speed of the car is "+ cr.speed+" kmph");
		
		System.out.println("-----------------------------------------");
		
		Bike bk = new Bike();
		bk.speed = 160;
		bk.engineNumber = 145;
		bk.start();
		bk.stop();
		System.out.println("Engine Number: "+ bk.engineNumber);
		System.out.println("Speed of the bike is "+ bk.speed+" kmph");
	}
}
