package hibernate.readObject.HibernateProject02;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App { //Read the Object Data Stored in the Database using Java Program with Hibernate
	
    public static void main(String[] args) {

    	Configuration configuration = new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	
    	
    	SessionFactory sessionFactory = configuration.buildSessionFactory();
    	
    	
    	Session session = sessionFactory.openSession();
    	
    	
    	Transaction transaction = session.beginTransaction();
    	
    	
    	Student student = session.get(Student.class, 160);
    	if (student != null) {
    		System.out.println(student);
    	}
    	else {
    		System.out.println("STUDENT RECORD WITH SPECIFIED ID DOES NOT EXIST.");
    	}
    	
    	
    	transaction.commit();
    	
    	
    	session.close();
    	sessionFactory.close();
    	
    	
    }
}
