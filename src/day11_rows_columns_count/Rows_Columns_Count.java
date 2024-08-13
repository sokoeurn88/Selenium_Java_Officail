package day11_rows_columns_count;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rows_Columns_Count {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");

		Thread.sleep(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[contains(text(),'Practice')]")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		int rowSize = driver.findElements(By.cssSelector("#product.table-display tr")).size();
		System.out.println(rowSize);
		int columnSize = driver.findElements(By.cssSelector("#product.table-display td")).size();
		System.out.println(columnSize);

//		System.out.println( driver.findElement(By.cssSelector("#product.table-display tr[2]")).getText());

		for (int i = 0; i < rowSize; i++) {

			if (i == 2) {

				for (int j = 0; j < 2; j++) {

					System.out.println(driver
							.findElement(By.xpath("//table[@class='table-display']/tbody/tr[" + i + "]/td[" + j + "]"))
							.getText());
				}
			}

		}

		Thread.sleep(Duration.ofSeconds(2));
		driver.quit();
	}

}
