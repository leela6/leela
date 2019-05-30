package Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {

	public static void main(String[] args) throws SQLException {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/lills","root","root");
		Statement s=c.createStatement();
		ResultSet rs=s.executeQuery("select * from student");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+ rs.getString(1)+" "+rs.getString(3));
			
		}
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
}
	}


