package com.pawana.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class testclass {

	public static void main(String[] args) {

SessionFactory sessionFactory;
		
		//now employee object is in transiant state

		sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		stdclass emp=new stdclass();
		stdclass emp1=new stdclass();

        emp.setName("lills");
		emp.setAddress("ffghg");
		
		emp.setName("pawana");
		emp.setAddress("hyd");

		session.saveOrUpdate(emp);

		session.getTransaction().commit();  //by writting this , now emp object willl move to database
	
	//session.evict(emp1); // emp object will remove from persistant, then garbage collector can collect ur emp  object
	 //session.clear();
		
		session.close();
		
	}			

	}


