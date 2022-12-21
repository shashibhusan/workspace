package com.javatpoint.mypackage;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.transform.Transformers;

public class HQLExampleOne {

	static SessionFactory sessionFactory;
	 
	
	
	public static void main( String[] args )
    {
		
		
		Configuration configuration=new Configuration()
	            .configure(); // configures settings from hibernate.cfg.xml

	    StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();

	    // If you miss the below line then it will complaing about a missing dialect setting
	    serviceRegistryBuilder.applySettings(configuration.getProperties());

	    ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
	    sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		 
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();

		 
		//Query query = session.createQuery("select e1.firstName,e1.lastName from Employee e1 where e1.id=:id");
		//query.setInteger("id", 0);
		Query query = session.createQuery("select e1.firstName,e2.firstName from Employee e1 left join EmployeeOne e2 ");
		List  empList = query.list();
		Iterator ite=empList.iterator();
		while (ite.hasNext()) {
			Object[] value=(Object[])ite.next();
			System.out.println(" Values are "+value[0]);
		}
		t.commit();
		session.close();
		
		//***************************************************************************************
		/* UPDATE
		Query<Employee> query = session.createQuery("update Employee set firstName=:fName where lastName =: lName");
		query.setParameter("fName","Zahid Sir");
		query.setParameter("lName","kumar");
		int a=query.executeUpdate();
		System.out.println("Number of row updated is : "+a);
		
		*/
		
		// DELETE
		/*
		Query<Employee> query = session.createQuery("delete Employee where lastName =: lName");
		query.setParameter("lName","kumar");
		int a=query.executeUpdate();
		System.out.println("Number of row affected is : "+a);
		*/
		//***************************************************************************************
		
		// INSERT INTO
		/*
		Query<Employee> query = session.createQuery("insert into Employee(id,firstName,lastName) select id,firstName,lastName from EmployeeOne  where id=5");
		int a=query.executeUpdate();
		System.out.println("Number of row affected is : "+a);
		*/
		
		
    }
}
