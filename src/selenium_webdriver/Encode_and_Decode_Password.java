package selenium_webdriver;

import org.apache.commons.net.util.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Encode_and_Decode_Password {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.nopcommerce.com/login");
		
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("pavanoltraining@gmail.com");
		Thread.sleep(300);
		driver.findElement(By.xpath("//*[@id='Password']")).sendKeys(decodeStringPassword("dGVzdDEyMw=="));
		Thread.sleep(300);
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();		
		
		
		String str = "test123";
		
		/*to encode a string use class Base64*/
		byte[] encodedString = Base64.encodeBase64(str.getBytes());
		System.out.println(new String(encodedString));
		
		/*decode the string*/
		byte[] decodedString = Base64.decodeBase64(encodedString);
		System.out.println(new String(decodedString));
	}
	
	/*this method to hide password from public*/
	static String decodeStringPassword(String password) {
		byte[] decodedStr1 = Base64.decodeBase64(password);
		return (new String(decodedStr1));
	}
	
	
	
	

}
