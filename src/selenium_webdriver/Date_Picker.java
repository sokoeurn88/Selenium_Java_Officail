package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker {

	public static void main(String[] args) throws InterruptedException {
		
		String month = "April 2024";
		String day = "11";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.net/");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"checkin\"]")).click();
		
		Thread.sleep(1000);
		
		while(true) {
			String expectedMonth = driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[5]/div[1]/table/thead/tr[1]/th[2]")).getText();
			System.out.println(expectedMonth);
			
			if(expectedMonth.equals(month)) {
				
				break;
				
			} else {
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[5]/div[1]/table/thead/tr[1]/th[3]/svg")).click();
//				driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[5]/div[1]/table/thead/tr[1]/th[3]/svg")).click();
			}
			
			
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[5]/div[1]/table/tbody/tr/td[contains(text(), "+day+")]")).click();

		

		
//		driver.quit();

	}

}
