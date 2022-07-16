package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {
	
	Connection connection;
	Statement statement;
	ResultSet resultSet;
	
	String columnValue;
	public String getDataFromDb( String columnName) {//we made this method paramerized to when we called it the column any column to enter that
		
		try {
			//set the properties of mySQL
			Class.forName("com.mysql.cj.jdbc.Driver."); //this is the name of mySQL we can searcg in google too com.mysql.cj.jdbc.Driver.
			String sqlUrl= "jdbc:mysql://localhost:3306/december2021";
			String sqlUsername ="root";
			String sqlPassword ="root";
			String sqlQuery = "select * from user;";
			
			//create connect to local database
			connection = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword); // here we use Connection interface and then we made it globle to reuse it
			//Empower the connection reference variable to execute queries
			statement = connection.createStatement();// here we use Statement interface to empower it then we made it globle to reuse it
			//Deliver the query 
			resultSet = statement.executeQuery(sqlQuery);//here we use ResultSet interface and then we made it globle to reuse it
			
			while(resultSet.next()) {
			return columnValue =resultSet.getNString(columnName); // then  we made it globle to use in feture
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if (resultSet != null)
				try {
					resultSet.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			if(connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
		}
		return columnValue;
		
	}

}
