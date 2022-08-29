package Review02;

import org.openqa.selenium.By;

import Utils.BaseClass;
import Utils.ConfigsReader;

public class LoginOrangeHRM extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		Thread.sleep(3000);

		tearDown();

	}

}
