package multiThreading13;

public class WarriorApp { // Synchronized Resource  (Variable)
	
	public static void main(String[] args) {
		
		Warrior warrior = new Warrior();
		
		Thread t1 = new Thread(warrior);
		Thread t2 = new Thread(warrior);
		
		t1.setName("Karna");
		t2.setName("Arjuna");
		
		t1.start();
		t2.start();
		
	}
}
