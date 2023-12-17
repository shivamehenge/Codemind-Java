package jdbc.example;

import java.sql.*;

public class JdbcTest {

	public static void main(String[] args) {
	
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hbtest","root","123456");
			Statement stmt = con.createStatement();
			System.out.println("Intresting Record");
			String sql = "Insert into jdbc values (1432)";
			stmt.executeUpdate(sql);
			
		}catch(Exception e) {
			System.out.println(e);
			
		}
	}

}
