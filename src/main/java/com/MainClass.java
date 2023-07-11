package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		//to obtain a session
		Session session = sf.openSession();
		
		//start the session/transaction
		session.beginTransaction();
		
		//write the business logic here onwards.
		Student s1 = new Student(1,"Bickey","Computer Science",  "Nepal");
		session.saveOrUpdate(s1);
		
		Student s2 = new Student(2,"Ashish","Business",  "India");
		session.saveOrUpdate(s2);
		
		Student s3 = new Student(3,"Mohammad","IT",  "Pakistan");
		session.saveOrUpdate(s3);
		
		Student s4 = new Student(4,"Young","Finance",  "Korea");
		session.saveOrUpdate(s4);
		
		Student s5 = new Student(5,"Xuing","IT",  "China");
		session.saveOrUpdate(s5);
		
		Student s6 = new Student(6,"Xui","CSIT",  "Taiwan");
		session.saveOrUpdate(s6);
		
		
		//get and save transaction
		session.getTransaction().commit();
		
		//close the session
		session.close();

	}

}
