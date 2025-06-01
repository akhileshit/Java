//28/11/24
package hibernate.manyToMany.HibernateProject10;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) { //Many to Many
        
    	SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	
    	Session session = sessionFactory.openSession();
    	
    	Transaction transaction = session.beginTransaction();
    	
    	
    	Student s1 = new Student();
    	s1.setName("Accha");
    	
    	Student s2 = new Student();
    	s2.setName("Sun");
    	
    	Course c1 = new Course();
    	c1.setName("MongoDB");
    	
    	Course c2 = new Course();
    	c2.setName("Oracle");
    	
    	List<Course> courses = new ArrayList<>();
    	courses.add(c1);
    	courses.add(c2);
    	
    	List<Student> students = new ArrayList<>();
    	students.add(s1);
    	students.add(s2);
    	
    	//Associating courses to all students
    	s1.setCourses(courses);
    	s2.setCourses(courses);
    	
    	//Associating students to all courses
    	c1.setStudents(students);
    	c2.setStudents(students);
    	
    	session.persist(s1);
    	session.persist(s2);
    	
    	
    	transaction.commit();
    	
    	session.close();
    	sessionFactory.close();
    }
}

//28/11/24
// includes (HibernateProject10-13 & many more if written in future (hiber..cache...))