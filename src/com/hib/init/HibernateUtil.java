package com.hib.init;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
	
	private static final SessionFactory sf;
	private static final ServiceRegistry sr;
	
	static{
		Configuration conf = new Configuration();
		conf.configure();
		sr = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
		try{
			sf = conf.buildSessionFactory(sr);
		}catch(Exception ex){
			System.err.println("Initial SessionFactory creation failed."+ ex);
			throw new ExceptionInInitializerError(ex);
		}
		
	}
	
	public static SessionFactory getSessionFactory() {
        return sf;
    }
}
