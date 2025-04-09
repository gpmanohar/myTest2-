package Class;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public PropertyUtility putil = new PropertyUtility();
	public WebDriverUtility wutil = new WebDriverUtility();
	WebDriver driver = new FirefoxDriver();
	
	@BeforeSuite
	public void bsconfig() {
		System.out.println("DB CONNECTED");
	}
	
	@BeforeClass
	public void bcconfig() throws IOException {
		String BROWSER = putil.readDataFromPropertyFileString("browser");
		String URL = putil.readDataFromPropertyFileString("url");
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
		WebDriver driver = new ChromeDriver();
		}
		if(BROWSER.equalsIgnoreCase("firefox")) {
			WebDriver driver = new FirefoxDriver();
		}
 
		wutil.maximizeWindow(driver);
		driver.get(URL);
		
		
			
	}}
