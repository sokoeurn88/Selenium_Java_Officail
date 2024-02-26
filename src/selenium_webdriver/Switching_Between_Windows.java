package selenium_webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switching_Between_Windows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		String pwindow = driver.getWindowHandle();
		System.out.println(pwindow);
		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("yolproms news");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		
		System.out.println(driver.getTitle());
		
		Set<String> s = driver.getWindowHandles();
		
		for(String swindow:s) {
			System.out.println(swindow);
			
			String t = driver.switchTo().window(swindow).getTitle();
			System.out.println(t);
			
			if(t.contains("yolproms news - Google Search")) {
				driver.close();
				
			} else {
				System.out.println("Close driver before or after");
			}
		}
		
		driver.quit();
		
		

	}

}
