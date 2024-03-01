package selenium_webdriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_Base_Testing_JDBC_DRIVER {

	public static void main(String[] args) throws SQLException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		/*To download jdbc client server: https://www.oracle.com/database/technologies/appdev/jdbc-downloads.html*/
		/*Create connection. jdbc:oracle:thin: is not changed. @localhost:1521/pdborcl","hr","hr" is changed based on local server location */
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborcl","hr","hr");
		
		/*Create statement or queries*/
		Statement stat = con.createStatement();
		
		/*Execute query. These state only execute in data base, it will not return anything*/
		String s = "insert into users values(102, 'mercury','mercury2')";
		String t = "update users set UNAME='mer22' where userid=102";
		String u = "delete users where userid=102";
		
		/*select query will return some data*/
		String v = "select uname, passwrd from users";

		stat.executeQuery(s);
		stat.executeQuery(t);
		stat.executeQuery(u);
		
		/*this time it will return some data*/
		ResultSet resultSet = stat.executeQuery(u);
		while(resultSet.next()) {
			String userName = resultSet.getString("uname");
			String password = resultSet.getString("passwrd");
			System.out.print(userName+" ");
			System.out.println(password);
			
			driver.findElement(By.name("name")).sendKeys("sc@mgail.com");
			driver.findElement(By.name("password")).sendKeys("sc123");
			driver.findElement(By.name("password")).click();
			
			if(driver.getTitle().equals("google.com")) {
				System.out.println("Test passed");
			} else {
				System.out.println("Test case failed");
			}
			
			driver.findElement(By.linkText("Home")).click();
			
		}
		
		/*close connection*/
		con.close();
		
		System.out.println("program is completed");
		
	}

}
