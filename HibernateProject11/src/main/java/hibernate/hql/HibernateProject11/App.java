package hibernate.hql.HibernateProject11;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Hello world!
 */
public class App {
	
    public static void main(String[] args) { //Hibernate Query Language. (like sql but for java(using class_names and its fields!!!)
        
    	SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	
    	Session session = sessionFactory.openSession();
    	
    	Transaction transaction = session.beginTransaction();
    	
    	
    	String hql = "from Product where cost > 40000";  //Product : capital "P" only
    	//String hql = "from Product where cost > :param1";
    	Query<Product> query = session.createQuery(hql, Product.class);
    	//query.setParameter("param1", 40000);
    	List<Product> productList = query.getResultList();
    	for (Product p : productList) {
    		System.out.print("ID: " + p.getId() + "  ");
    		System.out.print("NAME: " + p.getName() + "  ");
    		System.out.print("COST: " + p.getCost() + "  ");
    		System.out.println();
    		System.out.println("=======================================");
    	}
    	
    	
    	transaction.commit();
    	
    	session.close();
    	sessionFactory.close();
    }
}
