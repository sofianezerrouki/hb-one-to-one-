package com.camacode.hibernat.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.camacode.hibernat.demo.entity.Instructor;
import com.camacode.hibernat.demo.entity.InstructorDetail;
import com.camacode.hibernat.demo.entity.Student;

public class DeleteDemo {

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
			//create the object 
			/*
			Instructor tempInstructor = new Instructor
								("anoire","djilali","anoire@gmail.com");
			InstructorDetail tempInstructorDetail = new InstructorDetail
								("https://www.youtube.com/zerroukisofiane","football");
			*/
			//	associte the objects 
			
			Instructor tempInstructor = new Instructor
					("djamel","zerrouki","djq;el@gmail.com");
			InstructorDetail tempInstructorDetail = new InstructorDetail
					("https://www.youtube.com/djamel","music");
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			//Begin transaction 
			System.out.println("Begin transaction .... ");
			session.beginTransaction();
			
			//save the Instructor object
			//
			//Note: this will also save the details 
			//because of Cascade.ALl
			//
			//
			session.save(tempInstructor);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Done !");

		} 
		finally {
			factory.close();
		}

	}

}
