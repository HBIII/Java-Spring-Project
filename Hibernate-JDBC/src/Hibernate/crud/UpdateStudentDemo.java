package Hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Hibernate.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory= new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try 
		{
			int studentId=1;
			
			session.beginTransaction();
			
			//System.out.println(studentId);
			
			Student myStudent = session.get(Student.class, studentId);
			
			System.out.println("Updating");
			
			myStudent.setFirstName("Jack");
			myStudent.setLastName("Shukla");
			
			session.getTransaction().commit();
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			System.out.println("Update all emails");
			
			session.createQuery("update Student set email ='grp@gmail.com'").executeUpdate();
			
			session.getTransaction().commit();
 		} 
		
		finally {
			factory.close();
		}

	}

}
