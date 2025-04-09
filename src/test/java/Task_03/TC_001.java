package Task_03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_001 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8)); 
		
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook book  = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Data");
		Row rw = sh.getRow(0);
		Cell cl = rw.getCell(1);
		String Value = cl.getStringCellValue();
		System.out.println(Value);
		
				
	}

}
