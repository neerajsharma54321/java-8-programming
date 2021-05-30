package com.test.sampleapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class InsertRecord {
	public static void main(String ...s) {
		try {
//			SessionFactory sf = new Configuration().configure("hibernate.cfg.xml")
//					.addAnnotatedClass(Student.class)
//					.buildSessionFactory();
//Session session =sf.getCurrentSession();

		    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
		    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		  
		SessionFactory factory = meta.getSessionFactoryBuilder().build();  
			
		Session session =factory.getCurrentSession();
			session.beginTransaction();
			session.save(new Student("Neeraj", "Sharma", "neerajsharma54321@gmail.com"));
			session.getTransaction().commit();
		}catch(Exception ex) {
			// System.err.println("exception"+ex.getMessage());
			ex.printStackTrace();
		} finally {
			
		}
	}
}
