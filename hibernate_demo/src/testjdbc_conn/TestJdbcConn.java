package testjdbc_conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbcConn {
	public static void main(String str[]) {
		
		String connectionString = "jdbc:mysql://localhost:3306/hb_db?useSSL=false&serverTimezone=UTC";
		String user = "hbstudent";
		String password = "hbstudent";
		try{
			System.out.println("connecting to mysql database...");
			Connection con = DriverManager.getConnection(connectionString, user, password);
			System.out.println("connection succeeded.");
		}catch(Exception ex) {
			System.err.println("Oops... Unable to connect.");
		}
	}
}
