package selenium_webdriver;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoIT_Class {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		/*AutoIT is for Window and Desktop automation
		 * 
		 * To write autIT script u need 2 applications
		 * 
		 * AutoIT is for find address of element finding
		 * 
		 * SciTE is for writing AutoIT script
		 * 
		 * 3 Methods is needed:
		 * 
		 * 		-> ControlFocus("title","text",controlID) : sets input focus to a given control on a window. e.g ControlFocus("File Upload","","Edit1")
		 * 		Note: controlID = (class value + Instance value)
		 * 
		 * 
		 * 		-> ControlSetText("title","text",controlID,"path of file") : file path which is needed to upload, (set text of a control)
		 * 		e.g ControlSetText("File Upload","", Edit1, "C:\Users\sokoeurn chhay\Downloads\info(3).pdf")
		 * 
		 * 		-> ControlClick("title","text",controlID) : send a mouse click command to a given control
		 * 		e.g ControlClick("File Upload", "", "Button1")
		 * 
		 * Then save the file
		 * 
		 * Then compile the file -> Tools -> Compile -> Production -> EXE -> Compile X86 version(default) -> Compile Script
		 * 
		 * Then : Runtime.getRuntime().exec("\"C:\\Users\\sokoeurn chhay\\OneDrive\\Desktop\\FileUploadPDF.au3\"");
		 * 
		 * 
		 * */
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?client=firefox-b-d&q=upload+file+sample+website");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div[12]/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div/div/span/a/h3")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@name='upfile']")).click();

		
		Runtime.getRuntime().exec("\"C:\\Users\\sokoeurn chhay\\OneDrive\\Desktop\\FileUploadPDF.au3\"");
		
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		
		
		driver.quit();
	}

}
