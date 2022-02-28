//Write a program to insert 2 records in accountant table .
package Advance_java_Exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Exercise16 {
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
//	.......................Insert Data...............................................
	public void insert(int id,String name, String email,String pass) {
		try {
			PreparedStatement pst = cn.prepareStatement("insert into accountants (id,name,email,pass)valus(?,?,?,?)");
			
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setString(3, email);
			pst.setString(3, pass);
			System.out.println(pst);
			pst.executeUpdate();
			
			}catch (SQLException e) {
		 e.printStackTrace();
		}
	}
	
	public static void main(String [] args) throws Exception {
		Exercise16 obj=new Exercise16();
		Exercise16 obj1=new Exercise16();
		Exercise16 obj2=new Exercise16();
		obj.connectionCreate();
		obj1.insert(1,"priti","priti@gmail.com","Priti@123");
		obj2.insert(1,"tulsi","tulsi@gmail.com","tulsi@123");
	}
}


