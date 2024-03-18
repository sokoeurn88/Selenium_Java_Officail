package xpath_axes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Axes {

	public static void main(String[] args) {

		/*Xpath Axes : usually use for access multiple elements
		 * 
		 * self
		 * parent
		 * child
		 * ancestor
		 * descendant
		 * following
		 * following-sibling
		 * preceding
		 * precedding-sibling
		 * 
		 * 
		 * note after xpath axes use: :: e.g //*[@id='name']/self::tagname
		 *
		 * */
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://apastyle.apa.org/style-grammar-guidelines/tables-figures/sample-tables");
		
		System.out.println(driver.getTitle());
		
		//Example1: /self::
		driver.findElement(By.xpath("//a[contains(text(), 'India Tourism De)]/self::a"));
		
		//Example2: /parent::
		driver.findElement(By.xpath("//a[contains(text(), 'India Tourism De)]/parent::td"));

		
		//Example3: /child::      note: because current node does not have child. it needs to travel to ancestor node to get child element
		driver.findElement(By.xpath("//a[contains(text(), 'India Tourism De)]/ancestor::tr/child::td"));
		driver.findElement(By.xpath("//a[contains(text(), 'India Tourism De)]/child::div[10]/button"));
		
		//Example4: /ancestor::     
		driver.findElement(By.xpath("//a[contains(text(), 'India Tourism De)]/ancestor::tr"));
		
		//Example5: /descendants::     
		driver.findElement(By.xpath("//a[contains(text(), 'India Tourism De)]/ancestor::tr/descendants::"));
		
		//Example6: /following:: -> selecting all nodes after current nodes    
		driver.findElement(By.xpath("//a[contains(text(), 'India Tourism De)]/ancestor::tr/following::"));
		
		//Example7: /following-sibling::   
		driver.findElement(By.xpath("//a[contains(text(), 'India Tourism De)]/ancestor::tr/following-sibling::tr"));
		
		//Example8: /Preceding::   
		driver.findElement(By.xpath("//a[contains(text(), 'India Tourism De)]/ancestor::tr/preceding::tr"));
		
		//Example9: /Preceding-sibling::   
		driver.findElement(By.xpath("//a[contains(text(), 'India Tourism De)]/ancestor::tr/preceding-sibling::tr"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
