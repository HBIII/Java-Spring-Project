package Hibernate.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Hibernate.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory= new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try 
		{
			session.beginTransaction();
		
			List<Student> theStudents = session.createQuery("from Student").getResultList();
			
			displayStudent(theStudents);
			
			
			theStudents = session.createQuery("from Student s where s.lastName='Doe'").getResultList();
			
			displayStudent(theStudents);
			
			
			theStudents = session.createQuery("from Student s where s.lastName='Doe' OR s.firstName='Hrushabh'").getResultList();
			
			displayStudent(theStudents);
			
			theStudents = session.createQuery("from Student s where s.email LIKE '%1234'").getResultList();
			
			displayStudent(theStudents);
			
			session.getTransaction().commit();
			
			
 		} 
		
		finally {
			factory.close();
		}

	}

	private static void displayStudent(List<Student> theStudents) {
		for(Student students: theStudents)
		{
			System.out.println(students);
			
		}
		System.out.println();
	}

}
