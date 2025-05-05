package hibernate.auto.HibernateProject06;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App { // Demonstration of Auto Id Generation
	
    public static void main(String[] args) {

    	Configuration configuration = new Configuration();
    	SessionFactory sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory(); //one-liner
    	
    	Session session = sessionFactory.openSession();
    	
    	Transaction transaction = session.beginTransaction();
    	
    	AutoIdGeneration aid = new AutoIdGeneration();
    	//Id not set here. will be auto generated.
    	aid.setName("Bharath Sinha");
    	aid.setAge(22);
    	session.persist(aid);
    	
    	transaction.commit();
    	
    	session.close();
    	sessionFactory.close();
    }
}
