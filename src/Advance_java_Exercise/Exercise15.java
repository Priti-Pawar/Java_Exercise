//Write a program to create a table accountant with columns id,name. emailId and password.
package Advance_java_Exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Exercise15 {

	PreparedStatement ps;
	static Connection cn;
	static Statement st;
	ResultSet rs;
	private Connection connection;
	
	//....................Create Connection.........................................
	void connectionCreate()throws Exception {
		
		String driver="oracle.jdbc.driver.OracleDriver";
		String con="jdbc:oracle:thin:@localhost:1521:xe";
		String dbUser="system";
		String pass="1234";
		Class.forName(driver);
		cn=DriverManager.getConnection(con,dbUser,pass);
		System.out.println("DriverLoaded");
		st=cn.createStatement();
	}
	void create(Statement st) {
		try {
			PreparedStatement pst = cn.prepareStatement("create table accountant" +
	                   "(id integer not NULL, " +
	                   " name varchar(25), " + 
	                   " emailId varchar(25), " + 
	                   " password text, " + 
	                   " primary key( id ))");
			pst.executeUpdate();
			}catch (SQLException e) {
		 e.printStackTrace();
		}
	}
	public static void main(String [] args) throws Exception {
		Scanner sc= new Scanner(System.in);
		Exercise15 obj=new Exercise15();
		obj.connectionCreate();
}
}
	
		     

	
