package broken_links;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");
		
		//get all links from the web page
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		int noOfBrokenLink = 0;
		
		//checking links have attributes' values
		for(WebElement linkele:links) {
			String hrefValue = linkele.getAttribute("href");
			
			if(hrefValue==null || hrefValue.isEmpty()) {
				System.out.println(hrefValue+"is broken link");
				continue;
			}
			
			try {
			//not broken link connects to server
			URL linkURL = new URL(hrefValue);		//convert string URL to link URL
			
			HttpURLConnection connection = (HttpURLConnection) linkURL.openConnection();		//used linkURL to open connection
			connection.connect();
			
			//connection will return some status codes
			if(connection.getResponseCode()>=400) {
				System.out.println(hrefValue+" is broken link");
				noOfBrokenLink++;
			} else {
				System.out.println(hrefValue+" is not a broken link");
			}
			
			} catch(Exception e) {
				
			}
			
		}
		
		System.out.println("Number of broken links are "+ noOfBrokenLink);

	}

}
