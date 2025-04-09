package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_ADD_002 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://dunizb.github.io/sCalc/");
		System.out.println("Number 2 Entered");

		driver.findElement(By.xpath("//span[text()='ㅡ']")).click();
		driver.findElement(By.xpath("//span[text()='2']")).click();
		driver.findElement(By.xpath("//span[@id='equals']")).click();
		System.out.println(" + Entered");
		driver.findElement(By.xpath("//span[text()='＋']")).click();
		System.out.println("Number 3 Entered");
		driver.findElement(By.xpath("//span[text()='3']")).click();
		driver.findElement(By.xpath("//span[@id='equals']")).click();

		WebElement ele = driver.findElement(By.xpath("//div[@id='result']"));

		String res = ele.getText();
		System.out.println("The sum of Number is: " + res);

		driver.close();

	}
}
