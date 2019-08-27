package Hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Hibernate.entity.Course;
import Hibernate.entity.Instructor;
import Hibernate.entity.InstructorDetail;
import Hibernate.entity.Review;
import Hibernate.entity.Student;


public class CreateCourseAndStudentDemo {

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
		
			Course tempCourse = new Course("Artifical Intelligence");
		
			session.save(tempCourse);
			
			Student tempStudent1 = new Student("Chloe", "Garfield", "cg@gmail.com");
			Student tempStudent2 = new Student("Mary", "Zoe", "mz@gmail.com");
			
			tempCourse.addStudent(tempStudent1);
			tempCourse.addStudent(tempStudent2);
			
			session.save(tempStudent1);
			session.save(tempStudent2);
			
			System.out.println(tempCourse.getStudents());
			
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





