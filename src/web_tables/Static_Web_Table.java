package web_tables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_Web_Table {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com");

		int row = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Number of row:" + row);

		int column = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Number of column: " + column);

		for (int r = 2; r <= row; r++) {

			for (int c = 1; c <= column; c++) {

				Thread.sleep(300);
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c + "]"))
						.getText();
				System.out.print(value + "\t");

			}
			System.out.println();
		}

		for (int r = 2; r <= row; r++) {
			
			String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[2]")).getText();
//			System.out.println(authorName);
			
			if(authorName.equals("Mukesh")) {
				
				String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[1]")).getText();
				System.out.println(bookName+"\t"+authorName);
				
			}
			
		}

		driver.quit();
	}

}
