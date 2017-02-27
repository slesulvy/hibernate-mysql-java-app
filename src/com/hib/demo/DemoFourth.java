package com.hib.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hib.entities.Student;
import com.hib.init.HibernateUtil;

public class DemoFourth {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
         
        Student student = (Student) session.get(Student.class, 3);
         
        session.delete(student);
        session.getTransaction().commit();
         
        session.close();
	}

}
