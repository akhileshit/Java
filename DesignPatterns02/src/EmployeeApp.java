
public class EmployeeApp {

	public static void main(String[] args) {
		Employee e1 = Employee.getInstance();
		e1.work();
		e1.applyLeave();
		System.out.println(e1);
		
		System.out.println("=====================================");
		
		Employee e2 = Employee.getInstance();
		e2.work();
		e2.applyLeave();
		System.out.println(e2); // Should be referring to same object (not another object)
		
		//Employee emp = new Employee("Anonym", 22, "Male", 50000, 2, "Fulltime"); // not possible
	}

}
