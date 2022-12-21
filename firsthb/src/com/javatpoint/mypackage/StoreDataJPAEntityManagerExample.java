package com.javatpoint.mypackage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StoreDataJPAEntityManagerExample {

	public static void main( String[] args )
    {
		//Hibernate provides implementation of JPA interfaces EntityManagerFactory and EntityManager to persisting object in database
		// Here is example of JPA implementation
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		System.out.println("Starting Transaction");
		entityManager.getTransaction().begin();
		Employee employee = new Employee();
		employee.setFirstName("fName");
		employee.setLastName("lName");
		System.out.println("Saving Employee to Database");
		entityManager.persist(employee);
		
		entityManager.getTransaction().commit(); 
		
		/*
		 This is the Hibernate provided  SessionFactory & session Example to save object in dataBase. 
		*/
		
		/*StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Employee e1 = new Employee();
		e1.setId(1);
		e1.setFirstName("sonoo");
		e1.setLastName("jaiswal");

		session.save(e1);
		t.commit();
		System.out.println("successfully saved");
		factory.close();
		session.close();*/   
    }
}
