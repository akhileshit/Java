package hibernate.manyToOne.HibernateProject09;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App { // One to Many / Many to One! mapping usnig Hibernate
	
    public static void main(String[] args) {
        
    	//Load Configuration & Create the Session Factory
    	SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

    	//Open the Session
    	Session session = sessionFactory.openSession();
    	
    	//Begin the Transaction
    	Transaction transaction = session.beginTransaction();
    	
    	//Perform the Operation
    	Department dep = new Department();
    	dep.setName("IT");
    	
    	Employee e1 = new Employee();
    	e1.setName("Om Prasad");
    	e1.setSalary(100000);
    	e1.setDept(dep);
    	Employee e2 = new Employee();
    	e2.setName("Manish Yadav");
    	e2.setSalary(150000);
    	e2.setDept(dep);
    	
    	ArrayList<Employee> al = new ArrayList<>();
    	al.add(e1);
    	al.add(e2);
    	dep.setAl(al);
    	
//    	session.persist(e1); not required, since cascaded
//    	session.persist(e2);
    	session.persist(dep);
    	
    	
    	
    	//Commit the Transaction
    	transaction.commit();
    	System.out.println("DEPARTMENT AND EMPLOYEES DETAILS STORED(PERSISTED) IN THE DATABASE SUCCESSFULLY.");
    	
    	//Close the Session & Session Factory
    	session.close();
    	sessionFactory.close();
    }
}
