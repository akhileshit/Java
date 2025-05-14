package hibernate.criteriaAPI.HibernateProject13;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) { // Criteria API     (JPA Standards)
        
    	SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	
    	Session session = sessionFactory.openSession();
    	
    	Transaction transaction = session.beginTransaction();
    	
    	
    	
    	CriteriaBuilder cb = session.getCriteriaBuilder();
    	CriteriaQuery<Employee> cq =  cb.createQuery(Employee.class);
    	Root<Employee> root = cq.from(Employee.class);
    	
    	cq.select(root);
//    	cq.select(root).where(cb.gt(root.get("salary"), 50000));
//    	cq.select(root).where(cb.like(root.get("name"), "arun%"));
    	 
    	//STILL THERE.............
    	//refer tutorials point,chat
    	
    	
    	
    	
    	Query<Employee> query = session.createQuery(cq);
    	List<Employee> employees = query.getResultList();
    	
    	for (Employee e: employees) {
    		System.out.print("ID: " + e.getId() + "  ");
    		System.out.print("NAME: " + e.getName() + "  ");
    		System.out.println("SALARY: " + e.getSalary() + "  ");
    		System.out.println("=====================================");
    	}
    	
    	
    	
    	transaction.commit();
    	
    	session.close();
    	sessionFactory.close();
    }
}
