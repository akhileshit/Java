package hibernate.auto.HibernateProject06;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="autoid")
public class AutoIdGeneration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)      //We hv to specify that the table generates automatic id. i hv created a table named "autoid" and specified id to auto_increment.  //indicates that db will give values to id automatically
	int id;
	@Column
	String name;
	@Column
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
