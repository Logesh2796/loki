package jdpc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mysql.jdbc.PreparedStatement;

public class JDBCsql {

	public static void main(String[] args) {

		try {

			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root", "root");

			// create

			PreparedStatement ps = connect.prepareStatement("insert into emp values(?,?,?)");

			ps.setInt(1, 4);

			ps.setString(2, "raju");

			ps.setInt(3, 26);

			ps.executeUpdate();

			 System.out.println("Created");

			// update
//
//                                PreparedStatement ps = connect.prepareStatement("update emp set name=? where id =?");
//
//                                ps.setString(1, "JP");
//
//                                ps.setInt(2, 2);
//
//                                ps.executeUpdate();
//
//                                System.out.println("Connected");

                                  

//        // get

//                                PreparedStatement ps=connect.prepareStatement("select * from emp");
//
//                      ResultSet rs= ps.executeQuery();
//
//                      while(rs.next()) {
//
//                                int id=rs.getInt("id");
//
//                                String name=rs.getString("name");
//
//                               // boolean isConnect=rs.getBoolean("is_connected");
//                                int age =rs.getInt("age");
//                                
//                                System.out.println(id+" "+name+" "+age);

 //                 }
//
//        // delete

//                                   PreparedStatement ps = connect.prepareStatement("delete from emp where id=?");
//
//                                   ps.setInt(1, 5);
//
//                                   ps.executeUpdate();
//
//                                   System.out.println("deleted");

                                  

		} catch (SQLException e) {

			e.printStackTrace();

			System.out.println("not connected");

		}

	}
}
