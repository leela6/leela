package Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbcexample {

	public static void main(String[] args) {
		try {
		//register for the driver
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/leela","root","root");
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery("select * from emp");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			c.close();
			}catch (Exception e) {
				e.printStackTrace();
				
			}}}
