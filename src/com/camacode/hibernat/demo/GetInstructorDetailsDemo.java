package com.camacode.hibernat.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.camacode.hibernat.demo.entity.Instructor;
import com.camacode.hibernat.demo.entity.InstructorDetail;
import com.camacode.hibernat.demo.entity.Student;

public class GetInstructorDetailsDemo {

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
			
			int theId =3 ;  
			InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class, theId);
			System.out.println("tempInstructorDetail: "+tempInstructorDetail);
			
			System.out.println("the associated Instructor: "+tempInstructorDetail.getInstructor());
			
			//commit transaction
			session.getTransaction().commit();

			System.out.println("Done !");

		} 
		finally {
			factory.close();
		}

	}

}
