package selenium_webdriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.its.ITSValidityPeriod.Unit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Tables_Reading {

	public static void main(String[] args) {
		
		
		/*This code is not working, please pay more attention*/
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://apastyle.apa.org/style-grammar-guidelines/tables-figures/sample-tables");
		
		System.out.println(driver.getTitle());
		
		/*scrolling down the page*/
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1100)", "");
		
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		

		int r = driver.findElements(By.xpath("//*[@id='demographic261649001']/div/table/tbody/tr")).size();/*get row size*/
		System.out.println(r);
		
		int c =driver.findElements(By.xpath("//*[@id='demographic261649001']/div/table/tbody/tr/td")).size(); /*get column size*/
		System.out.println(c);
		
		for(int i=0;i<=r;i++) {
			
			for(int j=0;j<=c;j++) {
				
				System.out.print(driver.findElement(By.xpath("//*[@id='demographic261649001']/div/table/tbody/tr["+i+"]/td["+j+"]")).getText());
				
				
			}
			System.out.println();
		}
		
		
		
		driver.close();
		driver.quit();

	}

}
