package selenium_webdriver;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMap_as_login_Data {
	
	
	static HashMap<String, String> loginData(){
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Mr x", "Admin@admin123");
		hm.put("Mr y", "yuser@passwordy");
		hm.put("Mr z", "zuser@passwordz");
		return hm;
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		/*login as x*/
		HashMap_as_login_Data hmData = new HashMap_as_login_Data();
//		String credentials = hmData.loginData().get("Mr x");
		String credentials = hmData.loginData().get("Mr y");
		String arr[] = credentials.split("@");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(arr[0]);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(arr[1]);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		
		driver.quit();
		
	}

}
