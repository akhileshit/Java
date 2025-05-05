package hibernate03.HibernateProject01;

import org.hibernate.Session; // All imported from org.hibernate package
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App { // Inserting Student Object Data to MySql Database using Hibernate
    public static void main( String[] args ) {
    	
    	//Loading the Configuration
    	Configuration config = new Configuration();
    	config.configure("hibernate.cfg.xml");
    	
    	//Create Session Factory
    	SessionFactory factory = config.buildSessionFactory();
    	
    	//Open Session
    	Session session = factory.openSession();
    	
    	//Begin Transaction
    	Transaction transaction = session.beginTransaction();
    	Student stu = new Student();
    	stu.setId(159);
    	stu.setName("Bhargavi");
    	stu.setAge(25);
    	stu.setMarks(100);
    	stu.setEmail("bhargavi@kodnest.com");
    	stu.setPhone(897456123);
    	
    	//Perform Operations
    	session.persist(stu);  //session.save(stu)
    	
    	//Commit Transaction
    	transaction.commit();
    	
    	//Close Session
    	session.close();
    	
    	//Close Session Factory
    	factory.close();
    }
}
