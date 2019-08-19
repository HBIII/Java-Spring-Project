package Hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Hibernate.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory= new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try 
		{
			Student theStudent = new Student("Hrushabh", "Bhadkamkar","abcd@1234");
			
			session.beginTransaction();
			
			System.out.println(theStudent);
			
			session.save(theStudent);
			
			session.getTransaction().commit();
			
			System.out.println(theStudent.getId());
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			Student myStudent = session.get(Student.class, theStudent.getId());
			
			System.out.println(myStudent);
			
			session.getTransaction().commit();
			
			
 		} 
		
		finally {
			factory.close();
		}

	}

}
