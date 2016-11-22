package com.testes;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class HibernateUtil {
	
	private static final SessionFactory session = buildSessionFactory();

	public static SessionFactory getSession() {
		return session;
	}

	private static SessionFactory buildSessionFactory() {
		try{
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			return cfg.configure().buildSessionFactory();
		}catch (Throwable e){
			
			System.out.println("deu ruim");
			
			throw new ExceptionInInitializerError();
			
		}
		
	}
	
	
	
	
	
}

