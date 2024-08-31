
public class TeacherApp {

	public static void main(String[] args) {
		Teacher ref;
		
		ref = new JavaTeacher();
		new Classroom().acceptTeacher(ref);
		
		ref = new SQLTeacher();
		new Classroom().acceptTeacher(ref);
			
				// OR
//		new Classroom().acceptTeacher(new JavaTeacher());
//		new Classroom().acceptTeacher(new SQLTeacher());
	}

}
