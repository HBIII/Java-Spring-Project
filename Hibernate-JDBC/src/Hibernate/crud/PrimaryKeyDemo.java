package Hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Hibernate.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		SessionFactory factory= new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try 
		{
			Student theStudent1 = new Student("ramesh", "paul","ram@1234");
			Student theStudent2 = new Student("suresh", "doe","sur@1234");
			Student theStudent3 = new Student("kamlesh", "walker","kam@1234");
			
			session.beginTransaction();
			
			session.save(theStudent1);
			session.save(theStudent2);
			session.save(theStudent3);
			
			session.getTransaction().commit();
			
			
 		} 
		
		finally {
			factory.close();
		}

	}

}
