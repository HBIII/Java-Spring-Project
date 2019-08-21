package Hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Hibernate.entity.Instructor;
import Hibernate.entity.InstructorDetail;


public class CreateDemo {

	public static void main(String[] args) {
		SessionFactory factory= new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try 
		{	
			Instructor tempInstructor=new Instructor("Ram", "Kulkarni", "pqrs@13.com");
			
			InstructorDetail tempInstructorDetail = new InstructorDetail("www.world.com", "basketball");
			
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			session.beginTransaction();
			
			session.save(tempInstructor);
			
			session.getTransaction().commit();
			
			
 		} 
		
		finally {
			factory.close();
		}

	}

}
