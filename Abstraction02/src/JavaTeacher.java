
public class JavaTeacher extends Teacher{

	@Override
	void markAttendance() {
		System.out.println("Java Teacher is marking the attendance at the beginning of the class");
	}

	@Override
	void teach() {
		System.out.println("Java Teacher is teaching java");
	}
	
}
