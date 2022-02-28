//Write a program to insert 2 records in accountant table .
package Advance_java_Exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Exercise17 {
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
	void GetData() {
		Scanner sc = new Scanner(System.in);
		try {
			
			PreparedStatement pst = cn.prepareStatement("select * from accountants ");
             rs = pst.executeQuery();
             System.out.println("id\t\tname\t\t email\t\tpass");
 
            // Condiion check
            while (rs.next()) {
 
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String pass = rs.getString("pass");
                System.out.println(id + "\t\t" + name+ "\t\t" + email + "\t\t"+pass);
            }
		}
     catch (SQLException e) {
    	 System.out.println(e);
     }
	}
	public static void main(String [] args) throws Exception {
		Scanner sc= new Scanner(System.in);
		Exercise17 obj=new Exercise17();
		Exercise17 obj1=new Exercise17();
		obj.connectionCreate();
		obj.GetData();
		
	}
}
	

