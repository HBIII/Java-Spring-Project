package Hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Hibernate.entity.Student;

public class DeleteStudentDemo {

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
			
			System.out.println(studentId);
			
			//Student myStudent = session.get(Student.class, studentId);
			
			//System.out.println("Deleting");
			
			//session.delete(myStudent);
			
			System.out.println("Deleting student id=2");
			
			session.createQuery("delete from Student where id=2").executeUpdate();
			
			session.getTransaction().commit();
			
			
 		} 
		
		finally {
			factory.close();
		}

	}

}
