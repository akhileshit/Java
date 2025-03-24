package multiThreading11;

public class Demo1 implements Runnable {

	@Override
	public void run() { // Thread's Overridden method
		Thread t = Thread.currentThread();
		String name = t.getName();
		
		if (name.equals("type")) {
			type();
		}
		else if (name.equals("autosave")) {
			autosave();
		}
		else {
			autoSpellcheck();
		}
	}

	public void type() { // typing method  (foreground activity)
		try {
		for (int i=0; i<5; i++) {
			System.out.println("TYPING...");
			Thread.sleep(5000);
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void autoSpellcheck() { // auto-spell-check method  (background activity)
		try {
			for (; ;) {  // making it to run infinitely
				System.out.println("AUTO-SPELL-CHECKING...");
				Thread.sleep(5000);
			}
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

	public void autosave() { // auto-save method  (background activity)
		try {
			for (; ;) {  // making it to run infinitely
				System.out.println("AUTO-SAVING...");
				Thread.sleep(5000);
			}
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

}
