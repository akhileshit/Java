import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class DeliveryUnit implements Runnable {
	protected String deliveryId;
	protected String vehicleType;
	protected int time;
	protected PrintDeliveryStatus printStatus;
	
	public DeliveryUnit(String deliveryId, String vehicleType, int time, PrintDeliveryStatus printStatus) {
		this.deliveryId = deliveryId;
		this.vehicleType = vehicleType;
		this.time = time;
		this.printStatus = printStatus;
	}
}

class Bike extends DeliveryUnit {
	
	public Bike(String deliveryId, int time, PrintDeliveryStatus printStatus) {
		super(deliveryId, "BIKE", time, printStatus);
	}
	
	@Override
	public void run() {
		try {
			if (time > 0) {
				Thread.sleep(time);
				printStatus.deliveryStatuses.add("Delivery Completed: " + deliveryId + " via " + vehicleType + " in " + time + "ms");
			} else {
				throw new DeliveryAssignmentException("Failed to assign" + deliveryId + ": Invalid delivery time");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}

class Truck extends DeliveryUnit {
	
	public Truck(String deliveryId, int time, PrintDeliveryStatus printStatus) {
		super(deliveryId, "TRUCK", time, printStatus);
	}
	
	@Override
	public void run() {
		try {
			if (time > 0) {
				Thread.sleep(time);
				printStatus.deliveryStatuses.add("Delivery Completed: " + deliveryId + " via " + vehicleType + " in " + time + "ms");
			} else {
				throw new DeliveryAssignmentException("Failed to assign" + deliveryId + ": Invalid delivery time");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class Drone extends DeliveryUnit {
	
	public Drone(String deliveryId, int time, PrintDeliveryStatus printStatus) {
		super(deliveryId, "Drone", time, printStatus);
	}
	
	@Override
	public void run() {
		try {
			if (time > 0) {
				Thread.sleep(time);
				printStatus.deliveryStatuses.add("Delivery Completed: " + deliveryId + " via " + vehicleType + " in " + time + "ms");
			} else {
				throw new DeliveryAssignmentException("Failed to assign" + deliveryId + ": Invalid delivery time");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}

class PrintDeliveryStatus {
	
	List<String> deliveryStatuses = new ArrayList<>();
	
	public void printDeliveries() {
		for (String deliveryStatus: deliveryStatuses) {
			System.out.println(deliveryStatus);
		}
	}
}

class DeliveryAssignmentException extends Exception {
	
	public DeliveryAssignmentException(String message) {
		super(message);
	}
}

public class DeliveryTracker {
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		PrintDeliveryStatus printStatus = new PrintDeliveryStatus();
		
		
		List<Thread> deliveries = new ArrayList<>();
		for (int i=0; i<n; i++) {
			String[] delivery = sc.nextLine().split(" ");
			String deliveryId = delivery[0];
			String vehicleType = delivery[1];
			int time = Integer.parseInt(delivery[2]);
			
			
			switch (vehicleType) {
				case "BIKE" -> {
					Bike bike = new Bike(deliveryId, time, printStatus);
					Thread t = new Thread(bike);
					deliveries.add(t);
				}
				case "TRUCK" -> {
					Truck truck = new Truck(deliveryId, time, printStatus); 
					Thread t = new Thread(truck);
					deliveries.add(t);
				}
				case "DRONE" -> {
					Drone drone = new Drone(deliveryId, time, printStatus);
					Thread t = new Thread(drone);
					deliveries.add(t);
				}
				
				default -> {
					printStatus.deliveryStatuses.add("Failed to assign " + deliveryId + ": Invalid vehicle type");
				}
			}
		}
		
		for (Thread t: deliveries) {
			t.start();
		}
		
		for (Thread t: deliveries) {
			try {
				t.join();
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		
		printStatus.printDeliveries();
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
