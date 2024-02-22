package selenium_webdriver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_Data_into_Excel_DataDriveTest {

	public static void main(String[] args) throws IOException {
		
		Random random = new Random();
		int r = random.nextInt(10)+1; /*(10) will be random 1 - 9. if u want 10, it need to plus +1*/
		
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Excel\\test"+r+".xlsx");
		
		XSSFWorkbook workBook = new XSSFWorkbook();
		XSSFSheet sheetName = workBook.createSheet("testsheet"+r);
		for(int i =0;i<=20;i++) {
			XSSFRow row = sheetName.createRow(i);
			for(int j=0;j<=20;j++) {
				row.createCell(j).setCellValue("abc");
			}
		}
		workBook.write(file);
		file.close();
		System.out.println("Writing data into file is completed.");
	}

}
