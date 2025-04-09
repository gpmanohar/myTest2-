package Task_03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class T1 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\UserLogin.txt");
		Properties pro = new Properties();
		pro.load(fis);
		
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		
		WebDriver driver = new FirefoxDriver();
		driver.get(URL);
		
		driver.get(USERNAME);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(USERNAME);
	}

}
