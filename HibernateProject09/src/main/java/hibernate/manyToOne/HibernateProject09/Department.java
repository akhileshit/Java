package hibernate.manyToOne.HibernateProject09;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String name;
	
	@OneToMany(mappedBy = "dept", cascade = CascadeType.ALL)
	List<Employee> al;     // Since in the perspective of Java if department can hv multiple employee => list(ArrayList) of employees

	public int getId() {
		return id;
	}

	public void setId(int id) { // not req
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getAl() {
		return al;
	}

	public void setAl(List<Employee> al) {
		this.al = al;
	}
	
	
}
