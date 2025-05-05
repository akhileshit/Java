package hibernate.oneToMany.HibernateProject08;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Student { // One student can do Many courses
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String name;
	
	@Column
	String email;
	
	@Column
	long phone;
	
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)   
	List<Course> al;   // Since in the perspective of Java if a student can hv multiple courses => list(ArrayList) of courses.

	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public List<Course> getAl() {
		return al;
	}

	public void setAl(List<Course> al) {
		this.al = al;
	}
	
	
}
