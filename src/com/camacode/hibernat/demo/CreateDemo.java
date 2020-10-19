package com.camacode.hibernat.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.camacode.hibernat.demo.entity.Instructor;
import com.camacode.hibernat.demo.entity.InstructorDetail;
import com.camacode.hibernat.demo.entity.Student;

public class CreateDemo {

	public static void main(String[] args) {
		
		//create a session factory
		SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Instructor.class)
										.addAnnotatedClass(InstructorDetail.class)
										.buildSessionFactory();
		
		//create a session 
		Session session = factory.getCurrentSession();
		
		try {
			
			
			System.out.println("Begin transaction .... ");
			session.beginTransaction();
			
			//get the instructor by id 
			int theId = 4;
			Instructor tempInstructor = session.get(Instructor.class,theId);
			System.out.println("found the instructor : "+tempInstructor);
			//delete the Instructors
			if (tempInstructor!=null) {
				System.out.println("Deleting the instructor : "+tempInstructor);
				
				//this will also delete the details objects
				session.delete(tempInstructor);
				//commit transaction
				session.getTransaction().commit();
			}else {
				System.out.println("Instructor not found !!!!!!!");
			}
			
			System.out.println("Done !");

		} 
		finally {
			factory.close();
		}

	}

}
