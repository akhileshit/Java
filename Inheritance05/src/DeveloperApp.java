
public class DeveloperApp { // Method Hiding

	public static void main(String[] args) {
//		JavaDeveloper jd = new JavaDeveloper();
//		JavaDeveloper.doProject();
//		System.out.println("----------------");
//		
//		PythonDeveloper pd = new PythonDeveloper();
//		Developer d;
//		d = jd; // doesn't matter
//		d.doProject(); // It means Developer.doProject(); X
//		System.out.println("-----------------");
//		d = pd; // doesn't matter
//		d.doProject(); // It means Developer.doProject(); X
							//(or)
		Developer pd = new PythonDeveloper(); // Upcasting doesn't work here (Method Hiding)
		pd.doProject();
		
	}

}
