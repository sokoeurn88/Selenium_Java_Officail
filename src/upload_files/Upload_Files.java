package upload_files;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_Files {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		driver.findElement(By.xpath("//input[@name='filesToUpload']")).sendKeys("C:\\Users\\sokoeurn chhay\\OneDrive\\Documents\\sokoeurntext.rtf");
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("sokoeurntext.rtf")) {
			System.out.println("File is uploaded successfully.");
		} else {
			System.out.println("File is failed uploading.");
		}
		
		//upload multiple files
		String file1 = "C:\\Users\\sokoeurn chhay\\OneDrive\\Documents\\sokoeurntext.rtf";
		String file2 = "C:\\Users\\sokoeurn chhay\\OneDrive\\Documents\\sokoeurntext1.rtf";
		
		driver.findElement(By.xpath("//input[@name='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		int noOfFileUpload = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		//validate number of files
		if(noOfFileUpload==3) {
			System.out.println("file is uploaded.");
		}
		
		//validate files name
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("sokoeurntext.rtf")
				&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("sokoeurntext.rtf")
				&& driver.findElement(By.xpath("//ul[@id='fileList']//li[3]")).getText().equals("sokoeurntext1.rtf")){
			System.out.println("All files are matching...");
		} else {
			System.out.println("All file are not matching...");
		}
		
		
		
		
		Thread.sleep(2000);
		driver.quit();
	}

}
