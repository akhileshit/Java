package hibernate.manyToOne.HibernateProject09;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        
    	SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

    	Session session = sessionFactory.openSession();
    	
    	Transaction transaction = session.beginTransaction();
    	
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
    	
    	session.persist(dep);
    	
    	
    	transaction.commit();
    	
    	session.close();
    	sessionFactory.close();
    }
}
