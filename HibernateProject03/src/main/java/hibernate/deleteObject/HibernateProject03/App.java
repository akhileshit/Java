package hibernate.deleteObject.HibernateProject03;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App { // Delete the object data stored in the database using hibernate
	
    public static void main(String[] args) {
    	
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        
        Session session = sessionFactory.openSession();
        
        
        Transaction transaction = session.beginTransaction();
        
        //GET AND DELETE THE OBJECT DATA
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the Student Id to remove: ");
        int id = scan.nextInt();
        Student s1 = session.get(Student.class, id);
        if (s1 != null) {
        	session.remove(s1);
        	System.out.println("DATA WITH STUDENT ID " + id + " REMOVED.");
        }
        else {
        	System.out.println("STUDENT RECORD WITH ID " + id + " DOES NOT EXIST.");
        }
        
        
        transaction.commit();
        
        
        session.close();
        sessionFactory.close();
    }
}
