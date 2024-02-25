package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Tables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file://c:/SeleniumPractice/sample.html"); /*giv file path to webtable*/
		
		int r = driver.findElements(By.xpath("html/body/table/tbody/tr")).size();
		System.out.println(r);
		
		int c = driver.findElements(By.xpath("html/body/table/tbody/tr/th")).size();
		System.out.println(c);
		
		for(int i=0;i<=r;i++) {
			
			for(int j=0;j<=c;j++) {
				
				System.out.print(driver.findElement(By.xpath("html/body/table/tbody/tr["+i+"]/th["+j+"]")).getText());
				
			}
			
			System.out.println();
		}
	}

}
