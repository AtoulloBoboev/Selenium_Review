package Review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.CommonMethods;
import Utils.ConfigsReader;

public class LoginOrange extends CommonMethods {

	public static void main(String[] args) {

		
		setUp();
		
		
//		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(ConfigsReader.getProperty("username"));
//		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		sendText(userName, ConfigsReader.getProperty("username"));
		
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
		loginBtn.click();
		
		wait(2);
		
	
		tearDown();
		
	}

}
