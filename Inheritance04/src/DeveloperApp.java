
public class DeveloperApp { // Upcasting

	public static void main(String[] args) {
		JavaDeveloper jd = new JavaDeveloper();
		jd.attendMeeting();
		jd.doProject();
		System.out.println("----------------");
		
		PythonDeveloper pd = new PythonDeveloper();
		pd.attendMeeting();
		pd.doProject();
		System.out.println("-----------------");
		
		Developer ref1 = new JavaDeveloper(); // Upcasting
		ref1.attendMeeting();
		ref1.doProject();
		System.out.println("------------------");
		
		Developer ref2 = new PythonDeveloper(); // Upcasting
		ref2.attendMeeting();
		ref2.doProject();
	}

}
