package Hibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test_Jdbc {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user="hbstudent";
		String pass="hbstudent";
		
		
		try {
			System.out.println("Connecting to database");
			
			Connection myConn=DriverManager.getConnection(url, user, pass);
			
			System.out.println("Connection Established");
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
