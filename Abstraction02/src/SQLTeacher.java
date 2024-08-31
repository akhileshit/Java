
public class SQLTeacher extends Teacher {

	@Override
	void markAttendance() {
		System.out.println("SQL Teacher is marking the attendance at the end of the class");
	}

	@Override
	void teach() {
		System.out.println("SQL Teacher is teaching SQL");
	}

}
