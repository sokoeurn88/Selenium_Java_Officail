package day18_database_connection_testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;

public class Database_Connection_Testing {

	public static void main(String[] args) throws SQLException {
		String host ="localhost";
		String port = "3306";
		
		// Connection URL
		// "jdbc:mysql://"+host+":"+port+"/databasename;

		//Make connection from selenium to database
		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/demo", "root","root");
		
		Statement statement = con.createStatement();
		
		ResultSet resultSet = statement.executeQuery("select * from credentials where scenario='zerobalancecard'");
		
		//move pointer for 0 index to first index
		while(resultSet.next()) {
		
			System.out.println(resultSet.getString("username"));
			System.out.println(resultSet.getString("password"));
			
//			driver.findElement(By.id("username"))

		}
		

	}

}
