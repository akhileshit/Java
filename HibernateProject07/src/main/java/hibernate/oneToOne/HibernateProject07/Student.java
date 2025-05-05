package hibernate.oneToOne.HibernateProject07;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String email;
	
	@Column
	private long phone;
	
	@OneToOne(cascade = CascadeType.ALL)        //Cascades all operations (persist/merge/remove.. 
	@JoinColumn(name = "addr_id", referencedColumnName = "id")   
	private Address address;             // this should be "Address" type (not int) since this is java! not the database(the foreign key in sql means it refers to one whole row(record), so one whole record in java means 1 whole Object. That's all
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
