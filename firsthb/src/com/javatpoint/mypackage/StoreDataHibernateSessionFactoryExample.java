package com.javatpoint.mypackage;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class StoreDataHibernateSessionFactoryExample {
	
	static SessionFactory sessionFactory;

	public static void main( String[] args )
    {
		//Hibernate provides implementation of JPA interfaces EntityManagerFactory and EntityManager to persisting object in database
		// Here is example of JPA implementation
		/*EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		System.out.println("Starting Transaction");
		entityManager.getTransaction().begin();
		Employee employee = new Employee();
		employee.setFirstName("fName");
		employee.setLastName("lName");
		System.out.println("Saving Employee to Database");
		entityManager.persist(employee);
		
		entityManager.getTransaction().commit();*/ 
		
		/*
		 This is the Hibernate provided  SessionFactory & session Example to save object in dataBase. 
		*/
		
		Configuration configuration=new Configuration()
	            .configure(); 
	    StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
	    serviceRegistryBuilder.applySettings(configuration.getProperties());
	    ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
	    sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		 
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		
		Employee e1=(Employee)session.get(Employee.class, 0);

		Employee e2 = new Employee();
		e2.setId(2);
		e2.setFirstName("sonoo");
		e2.setLastName("jaiswal");
		//session.update(e2);
		session.merge(e2);
		//session.save(e1);
		t.commit();
		System.out.println("successfully saved");
		   
    }
}
