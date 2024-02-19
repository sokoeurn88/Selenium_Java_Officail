package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionals_Commands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.navigate().to("https://www.facebook.com");
		System.out.println(driver.getTitle());
		
		 WebElement emailElement = driver.findElement(By.xpath("//input[@id='email']"));
		 WebElement passElement = driver.findElement(By.xpath("//input[@id='pass']"));
		
		if(emailElement.isDisplayed() && emailElement.isEnabled()) {
			emailElement.sendKeys("sokoeurn.chhaya@gmail.com");
		}
		
		if(passElement.isDisplayed() && passElement.isEnabled()) {
			passElement.sendKeys("abc123");
		}
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		
//		boolean femaleEle = driver.findElement(By.xpath("//label[contains(text(),'Female')]")).isSelected();
//		System.out.println(femaleEle);
//		
//		boolean maleEle = driver.findElement(By.xpath("//label[contains(text(),'Male')]")).isSelected();
//		System.out.println(maleEle);
//		
//		boolean customEle = driver.findElement(By.xpath("//label[contains(text(),'Custom')]")).isSelected();
//		System.out.println(customEle);
//		
//		if(femaleEle==false) {
//			driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
//		}
		

		
		driver.quit();

	}

}
