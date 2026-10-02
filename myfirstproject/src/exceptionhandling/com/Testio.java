package exceptionhandling.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Testio {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sbdata","root","root");
  Statement stmt=con.createStatement();
  String sql="select*from employeess";
  ResultSet rs=stmt.executeQuery(sql);
  while(rs.next()) {
  System.out.println("hello");
  System.out.print(rs.getInt(1)+ " ");
  System.out.print(rs.getString(2)+ " ");
  System.out.print(rs.getString(3)+ " ");
  System.out.print(rs.getInt(4)+ " ");
  System.out.println();
  }
  
	}catch(Exception e) {
		System.out.println("in catch");
		e.printStackTrace();
	}

}
}
