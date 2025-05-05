package hibernate.oneToMany.HibernateProject08;

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

    	SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	
    	Session session = sessionFactory.openSession();
    	
    	Transaction transaction = session.beginTransaction();
    	
    	Course c1 = new Course();
    	c1.setName("Java");
    	Course c2 = new Course();
    	c2.setName("Python");
    	
    	Student stu = new Student();
    	stu.setName("Abhinav Shastri");
    	stu.setEmail("abhinav@kodnest.com");
    	stu.setPhone(8989898989L);
    	ArrayList<Course> al = new ArrayList<>();
    	al.add(c1);
    	al.add(c2);
    	stu.setAl(al);
    	
    	c1.setStudent(stu);
    	c2.setStudent(stu);
    	
    	session.persist(stu);
    	
    	
    	transaction.commit();
    	
    	session.close();
    	sessionFactory.close();
    }
}
