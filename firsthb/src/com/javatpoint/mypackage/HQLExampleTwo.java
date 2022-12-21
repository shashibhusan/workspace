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

public class HQLExampleTwo {

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
		
		//Native SQL using DTO
		
		/*List resultWithAliasedBean = session.createSQLQuery(
				  "SELECT E.firstName as firstName ,E.lastName  as lastName FROM empdata E LEFT JOIN empdataone E1 ON E.id = E1.id"
				  )
				  .addScalar("firstName")
				  .addScalar("lastName")
				  .setResultTransformer( Transformers.aliasToBean(DTO.class))
				  .list();
		  		DTO dto =(DTO) resultWithAliasedBean.get(0);
				System.out.println("===Value="+dto.getFirstName());*/
		
		//Native Query using Object Array	
		
		
		List resultWithAliasedBean = session.createSQLQuery(
				  "SELECT E.firstName as firstName ,E.lastName  as lastName FROM empdata E LEFT JOIN empdataone E1 ON E.id = E1.id"
				  )
				  .list();
		  		Iterator ite=resultWithAliasedBean.iterator();
		  		while (ite.hasNext()) {
		  			Object[] obj=(Object[])ite.next();
		  			System.out.println("===="+obj[0]);
				}
    		}
}
