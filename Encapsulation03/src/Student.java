
public class Student {
	private String name;
	private int age;
	private String gender;
	
	void eat() {
		System.out.println("Student is eating..");
	}
	
	void sleep() {
		System.out.println("Student is sleeping..");
	}
	
	void study() {
		System.out.println("Student is gender..");
	}

	// Access name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null)
			this.name = name;
		else
			System.out.println("What name is this????");
	}

	// Access age
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 0)
			this.age = age;
		else
			System.out.println("Seriously!!!!!!!");
	}

	// Access gender
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		if(gender != null)
			this.gender = gender;
		else
			System.out.println("Seriously????");
		
	}
}
