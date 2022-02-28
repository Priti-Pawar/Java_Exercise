//Write a program to delete a accountant whose id = 405 from accountant table.
package Advance_java_Exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Exercise18 {
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
	void deleteData(int id) {
		try {
		PreparedStatement pst = cn.prepareStatement("delete from accountant where id=?");
		pst.setInt(1, id);
		pst.executeUpdate();
	    System.out.println(pst);
	}catch (SQLException e) {
	 e.printStackTrace();
	}
}
	public static void main(String args[]) {
		Exercise18 obj=new Exercise18();
		obj.deleteData(405);
	
	}

}
