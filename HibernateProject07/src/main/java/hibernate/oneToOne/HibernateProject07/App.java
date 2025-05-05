package hibernate.oneToOne.HibernateProject07;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App { // One to One Mapping using Hibernate
	
    public static void main(String[] args) {
        
    	SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory(); //1-liner
    	
    	Session session = sessionFactory.openSession();
    	
    	Transaction transaction = session.beginTransaction();
    	
    	
    	Address addr = new Address();
    	//id will be auto generated
    	addr.setCity("Bengaluru");
    	addr.setStreet("BTM Layout");
    	
    	Student stu = new Student();
    	stu.setId(2);
    	stu.setName("abhinav");
    	stu.setEmail("abhinav@kodnest.com");
    	stu.setPhone(8989898989L);
    	stu.setAddress(addr);
    	
//    	session.persist(addr);  //no need to specify! since we specified to cascade operations
    	session.persist(stu);
    	
    	
    	transaction.commit();
    	
    	session.close();
    	sessionFactory.close();
    	
    }
}
