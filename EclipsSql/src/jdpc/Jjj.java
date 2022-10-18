package jdpc;

import java.sql.DriverManager;

public class Jjj {
	public static void main(String args[]) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root", "root");
			// here data is database name, root is username and password
			java.sql.Statement stmt = con.createStatement();
			java.sql.ResultSet rs = stmt.executeQuery("select * from emp");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		} finally {
		}
	}

}
