package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		/*
		e.g1 <input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email"
		 		placeholder="Email or phone number" autofocus="1" aria-label="Email or phone number">
		 
		 
		e.g2 <a role="button" class="_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy" 
				href="#" ajaxify="/reg/spotlight/" id="u_0_0_/p" data-testid="open-registration-form-button" rel="async">Create new account</a>
		
		Locators:
			ID
			
			NAME
			
			LINK TEXT -> driver.findElement(By.linkText("REGISTER").Click(); always start with: < a href="abc.php">REGISTER/>
			
			CSS SELECTORS - CASCADING SYTLE SHEET
				
				TAG AND ID(#) -> driver.findElement(By.cssSelector("input#email")).sendKeys("sokouern88");
				
				TAG AND CLASS(.) -> driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy")).sendKeys("sokoeurn88");
				
				TAG AND ATRRIBUTES (is anything with value such ash: id="email", type="text") 
				-> driver.findElement(By.cssSelector("input[type=text]").sendKeys("sokoeurn88");
				-> driver.findElement(By.cssSelector("input[name=email]").sendKeys("sokoeurn88");
				
				TAG CLASS AND ATTRIBUTES
				->driver.findElement(By.cssSector("input.inputtext _55r1 _6luy[type=text]")).sendKeys("sokoeurn88");
				->
				
				INNER TEXT -> driver.findElement(By.cssSelector("tag:contains("text from the website")").sendKeys("sokoeurn88");
							e.g -> driver.findElement(By.cssSelector("a:contains("Create new account")")).sendKeys("sokoeurn88");
				
			XPATH is the address of web element
			
				ABSOLUTE XPATH:
				
				RELATIVE XPATH:
			
			
			*
			*/
		
		
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.navigate().to("https://www.facebook.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		

	}

}
