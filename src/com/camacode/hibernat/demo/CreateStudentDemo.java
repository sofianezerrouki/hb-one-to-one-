package com.camacode.hibernat.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.camacode.hibernat.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		
		//create a session factory
		SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Student.class)
										.buildSessionFactory();
		
		//create a session 
		Session session = factory.getCurrentSession();
		
		try {
			//use the session object to save java object
			System.out.println("Create a student object .... ");
			Student tempStudent = new Student("zerrouki", "sofiane", "sofiane@gmail.com");
	
			//Begin transaction 
			System.out.println("Begin transaction .... ");
			session.beginTransaction();
			
			//save the student object  
			System.out.println("Save a student object .... ");
			session.save(tempStudent);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Done !");


		} 
		finally {
			factory.close();
		}

	}

}
