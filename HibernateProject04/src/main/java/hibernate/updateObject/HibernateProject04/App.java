package hibernate.updateObject.HibernateProject04;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App { // Update the Object Data Stored in the Database using Hibernate
	
    public static void main( String[] args ) {
    	
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        
        Session session = sessionFactory.openSession();
        
        
        Transaction transaction = session.beginTransaction();
        
        //GET AND UPDATE THE OBJECT DATA
        Student student = session.get(Student.class, 175);
        if (student != null) {
        	student.setName("Arghya Subhash");
        	student.setMarks(99);
        	session.update(student);
        }
        else {
        	System.out.println("STUDENT RECORD WITH THE SPECIFIED ID DOES NOT EXIST.");
        }
        
        
        transaction.commit();
        
        
        session.close();
        sessionFactory.close();
    }
}
