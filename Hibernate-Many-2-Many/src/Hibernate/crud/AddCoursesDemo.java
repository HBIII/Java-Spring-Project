package Hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Hibernate.entity.Course;
import Hibernate.entity.Instructor;
import Hibernate.entity.InstructorDetail;
import Hibernate.entity.Review;
import Hibernate.entity.Student;


public class AddCoursesDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Review.class)
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		

		Session session = factory.getCurrentSession();
		
		try {			
			
			session.beginTransaction();
		
			int studentId=1;
			
			Student tempStudent = session.get(Student.class, studentId);
			
			System.out.println(tempStudent.getCourses());
			
			Course tempCourse1 = new Course("Software Management");
			Course tempCourse2 = new Course("Data Mining");
			
			tempCourse1.addStudent(tempStudent);
			tempCourse2.addStudent(tempStudent);
			
			session.save(tempCourse1);
			session.save(tempCourse2);
			
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			
			// add clean up code
			session.close();
			
			factory.close();
		}
	}

}





