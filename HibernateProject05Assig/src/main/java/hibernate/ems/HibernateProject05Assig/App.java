package hibernate.ems.HibernateProject05Assig;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
	
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
        System.out.println("=====EMPLOYEE MANAGEMENT SYSTEM=====");
        while(true) {
        	System.out.println("===============================");
        	System.out.println("Press-1------->READ EMPLOYEE");
        	System.out.println("Press-2------->ADD EMPLOYEE");
        	System.out.println("Press-3------->REMOVE EMPLOYEE");
        	System.out.println("Press-4------->UPDATE EMPLOYEE");
        	System.out.println("PRESS ANY OTHER KEY TO STOP.");
        	
        	String choice = scan.next();
        	switch(choice) {  //This syntax of switch-case No need "break"
        	case "1" -> readEmployee();
        	case "2" -> addEmployee();
        	case "3" -> removeEmployee();
        	case "4" -> updateEmployee();
        	default -> {
        		System.out.println("NO OPERATIONS SELECTED.");
        		System.out.println("PROGRAM STOPPED.");
        		return;
        	}
        	}
        }
    }
    //************************************************************************************
    //READ FUNCTION
    public static void readEmployee() {
    	try {
    		Scanner scan = new Scanner(System.in);
	    	boolean done = false;
	    	int id=0;
	    	while (!done) {
		    	try {
		    	System.out.println("Enter the ID of an Employee to fetch the details: ");
		    	id = scan.nextInt();
		    	done = true;
		    	}
		    	catch (InputMismatchException | NumberFormatException  e) {
		    		System.err.println("PLEASE ENTER PROPER & VALID ID (+ve integers only).");
		    		scan.nextLine(); //to consume the bad input given
		    	}
	    	}
	    	//Load the Configuration file
	    	Configuration configuration = new Configuration();
	    	configuration.configure("Hibernate.cfg.xml");
	    	//Create the Session Factory
	    	SessionFactory sessionFactory = configuration.buildSessionFactory();
	    	//Open a Session
	    	Session session = sessionFactory.openSession();
	    	//Begin the Transaction
	    	Transaction transaction = session.beginTransaction();
	    	//Perform the Read Operation
	    	Employee e1 = session.get(Employee.class, id);
	    	if (e1 != null) {
	    		System.out.println(e1);
	    		System.out.println("RECORD FETCHED.");
	    	}
	    	else {
	    		System.out.println("THE EMPLOYEE RECORD WITH ID " + id + " DOES NOT EXIST.");
	    	}
	    	//Commit the Transaction
	    	transaction.commit();
	    	//Close the Session & Session Factory
	    	session.close();
	    	sessionFactory.close();
    	}
    	
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    }
  //************************************************************************************
    //ADD FUNCTION
    public static void addEmployee() {
    	try {
    		Scanner scan = new Scanner(System.in);
	    	boolean done = false;
	    	int id=0; String name=null; int salary=0; long phone=0; String email=null; String type=null;
	    	
	    	while (!done) {
		    	try {
		    	System.out.println("Enter the ID (int): ");
		    	id = scan.nextInt();
		    	System.out.println("Enter the NAME (String): ");
		    	name = scan.next();
		    	System.out.println("Enter the SALARY (int): ");
		    	salary = scan.nextInt();
		    	System.out.println("Enter the PHONE: (long)");
		    	phone = scan.nextLong();
		    	System.out.println("Enter the EMAIL: (String)");
		    	email = scan.next();
		    	System.out.println("Enter the TYPE(Full-Time/Part-Time): ");
		    	type = scan.next();
		    	
		    	done = true;
		    	}
		    	catch (InputMismatchException | NumberFormatException  e) {
		    		System.err.println("PLEASE ENTER PROPER DATA.");
		    		scan.nextLine();
		    	}
	    	}
	    	
	    	Configuration configuration = new Configuration();
	    	configuration.configure("hibernate.cfg.xml");
	    	
	    	SessionFactory sessionFactory = configuration.buildSessionFactory();
	    	
	    	Session session = sessionFactory.openSession();
	    	
	    	Transaction transaction = session.beginTransaction();
	    	
	    	Employee e1 = new Employee(id, name, salary, phone, email, type);
	    	session.persist(e1);
	    	System.out.println("RECORD ADDED.");
	    	
	    	transaction.commit();
	    	
	    	session.close();
	    	sessionFactory.close();
    	}
    	
    	catch (Exception e) {
    		e.printStackTrace();
    	}
   
    }
  //************************************************************************************
    //REMOVE FUNCTION
    public static void removeEmployee() {
    	try {
    		Scanner scan = new Scanner(System.in);
	    	boolean done = false;
	    	int id=0;
	    	while (!done) {
		    	try {
		    	System.out.println("Enter the ID of an Employee to fetch and remove the record: ");
		    	id = scan.nextInt();
		    	done = true;
		    	}
		    	catch (InputMismatchException | NumberFormatException  e) {
		    		System.err.println("PLEASE ENTER PROPER & VALID ID (+ve integers only).");
		    		scan.nextLine();
		    	}
	    	}
	    	
	    	
	    	Configuration configuration = new Configuration();
	    	configuration .configure("hibernate.cfg.xml");
	    	
	    	SessionFactory sessionFactory = configuration.buildSessionFactory();
	    	
	    	Session session = sessionFactory.openSession();
	    	
	    	Transaction transaction = session.beginTransaction();
	    	//Get it and remove it
	    	Employee e1 = session.get(Employee.class, id);
	    	if (e1 != null) {
	    		session.remove(e1);
	    		System.out.println("RECORD REMOVED.");
	    	}
	    	else {
	    		System.out.println("THE EMPLOYEE RECORD WITH ID " + id + " DOES NOT EXIST.");
	    	}
	    	
	    	transaction.commit();
	    	
	    	session.close();
	    	sessionFactory.close();
    	}
    	
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    }
  //************************************************************************************
    //UPDATE FUNCTION
    public static void updateEmployee() {
    	try {
    		Scanner scan = new Scanner(System.in);
			boolean done1 = false;
	    	int id=0;
	    	while (!done1) {
		    	try {
		    	System.out.println("Enter the ID of an Employee to update details: ");
		    	id = scan.nextInt();
		    	done1 = true;
		    	}
		    	catch (InputMismatchException | NumberFormatException  e) {
		    		System.err.println("PLEASE ENTER PROPER & VALID ID (+ve integers only).");
		    		scan.nextLine();
		    	}
	    	}
	    	
	  
	    	Configuration configuration = new Configuration();
	    	configuration.configure("hibernate.cfg.xml");
	    	
	    	SessionFactory sessionFactory = configuration.buildSessionFactory();
	    	
	    	Session session = sessionFactory.openSession();
	    	
	    	Transaction transaction = session.beginTransaction();
	    	
	    	Employee e1 = session.get(Employee.class, id);
	    	boolean updates = false;
	    	boolean done = false;
	    	if (e1 != null) {
	    		while (!done) {
	    			System.out.println("=========================");
	    			System.out.println("Press-1---->Update Name");
	    			System.out.println("Press-2---->Update Salary");
	    			System.out.println("Press-3---->Update Phone");
	    			System.out.println("Press-4---->Update Email");
	    			System.out.println("Press-5---->Update Type");
	    			System.out.println("PRESS ANY OTHER KEY IF UPDATATIONS COMPLETED OR TO STOP.");
	    			
	    			String choice = scan.next();
	    			switch (choice) {
		    			case "1" -> {
		    				System.out.println("Please enter the NAME to update: ");
		    				String name = scan.next();
		    				e1.setName(name);
		    				System.out.println("NAME UPDATED.");
		    				updates = true;
		    			}
		    			case "2" -> {
		    				System.out.println("Please enter the SALARY to update: ");
		    				int salary = scan.nextInt();
		    				e1.setSalary(salary);
		    				System.out.println("SALARY UPDATED.");
		    				updates = true;
		    			}
		    			case "3" -> {
		    				System.out.println("Please enter the PHONE NUMBER to update: ");
		    				long phone = scan.nextLong();
		    				e1.setPhone(phone);
		    				System.out.println("PHONE NUMBER UPDATED.");
		    				updates = true;
		    			}
		    			case "4" -> {
		    				System.out.println("Please enter the EMAIL to update: ");
		    				String email = scan.next();
		    				e1.setEmail(email);
		    				System.out.println("EMAIL UPDATED.");
		    				updates = true;
		    			}
		    			case "5" -> {
		    				System.out.println("Please enter the TYPE(Full-Time/Part-Time) to update: ");
		    				String type = scan.next();
		    				e1.setType(type);
		    				System.out.println("TYPE UPDATED.");
		    				updates = true;
		    			}
		    			default -> {
		    				done = true;
		    			}
	    			}//switch close
	    		}//while close
	    		
	    		if (updates) {
	    			session.update(e1);
	    			System.out.println("DATABASE UPDATED.");
	    		}
	    	}
	    	else {
	    		System.out.println("THE EMPLOYEE RECORD WITH ID " + id + " DOES NOT EXIST.");
	    	}
	    	
	    	
	    	transaction.commit();
	    	
	    	
	    	session.close();
	    	sessionFactory.close();
    	}
    	
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    }
  //************************************************************************************
}
