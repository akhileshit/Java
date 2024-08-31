
public class StudentApp {
	public static void main(String[] args) {
		Student stu1 = new Student(); // Student() is the constructor we are calling (Since time immemorial!!!)
		stu1.setValues(2, "Kiran");
		stu1.study();
		
		Student stu2 = new Student(); 
		stu2.setValues(3, "Kanchana");
		stu2.study();
	}
}
