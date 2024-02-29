package selenium_webdriver;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class Automate_BarCode_using_ZXing_API {

	public static void main(String[] args) throws IOException, NotFoundException {
		
		/*ZXing is one of the third party API will be used to automate Bar Codes/ QR Codes
		 * 
		 * Download ZXing API jar (javase-3.3.3 jar) from Maven Repository
		 * 
		 * Need these two:
		 * https://mvnrepository.com/artifact/com.google.zxing/javase
		 * https://mvnrepository.com/artifact/com.google.zxing/core
		 * 
		 * Bar-Code generator: https://barcode.tec-it.com
		 * 
		 * for bar code generator: https://barcode.tec-it.com/en/
		 * 
		 * */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://testautomationpractice.blogspot.com");
		driver.get("https://www.google.com/search?sca_esv=859d16dfe220efcd&rlz=1C1CHBF_enUS964US964&hl=en&sxsrf=ACQVn0-j5zdsYxGyFq5yNh2QKhq3ltvsHg:1709224727054&q=barcode+sample+practice&tbm=isch&source=lnms&sa=X&ved=2ahUKEwjY1Mml_tCEAxW-JEQIHar7DIMQ0pQJegQIDBAB&biw=1536&bih=742&dpr=1.25");

//		String barCodeURL = driver.findElement(By.xpath("//*[@id='islrg']/div[1]/div[1]/a[1]/div[1]/img")).getAttribute("src");
		String barCodeURL = driver.findElement(By.xpath("//*[@id='islrg']/div[1]/div[2]/a[1]/div[1]/img")).getAttribute("src");
		
		System.out.println(barCodeURL);
		
		URL url = new URL(barCodeURL);
		
		BufferedImage bufferedImage = ImageIO.read(url);
		
		LuminanceSource luminanceSource = new BufferedImageLuminanceSource(bufferedImage);
		
		BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(luminanceSource));
		
		Result result = new MultiFormatReader().decode(binaryBitmap);
		
		/*get text from bar code*/
		System.out.println(result.getText());
		
		driver.quit();
	}

}
