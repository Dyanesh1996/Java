/*
 * 	Steps : 
 * 	1 - import the package --> java.sql
 * 	2 - Load and register the driver --> com.mysql.jdbc.Driver 
 * 	3 - Create connection --> Create object of Connection interface
 * 	4 - Create Statement  --> Create object of Statement interface
 * 	5 - Execute query
 * 	6 - Process the results
 * 	7 - Close
 * 
 * 
 * 
 * 
 */


package com.telusko.jdbc;


import java.sql.*;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost://3306: aliens";		//aliens is the table i mySql
		String uname = "root";
		String pwd = "";
		String query = "Select username from student where userid = 3";
		
		Class.forName("com.mysql.jdbc.Driver");		//to load the Driver class
		Connection con = DriverManager.getConnection(url, uname, pwd);	/*Connection is an interface..
																		So take the method of DriverManager 
																		class that returns object of Connection*/
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		String name = rs.getString(2);				//2 is cplumn index
		rs.next();									
		System.out.println(name);
		st.close();
		con.close();
		
	}

}
