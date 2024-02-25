package selenium_webdriver;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataintoExcel3 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Excel\\test100.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook();
		XSSFSheet sheetName = workBook.createSheet("data1");
		
		for(int i=0;i<=5;i++) {
			
			XSSFRow row = sheetName.createRow(i);
			
			for(int j=0;j<=10;j++) {
				row.createCell(j).setCellValue("Mr chhay");
			}
		}
		workBook.write(file);
		file.close();
		System.out.println("Writing data into excel is completed");
	}

}
