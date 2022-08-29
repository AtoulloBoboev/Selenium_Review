package Review05;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Utils.CommonMethods;
import Utils.ConfigsReader;

public class ScreenshotExample extends CommonMethods {

	public static void main(String[] args) {
		// https://opensource-demo.orangehrmlive.com/

		setUp();

		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));
		click(driver.findElement(By.id("btnLogin")));

		wait(1);

		click(driver.findElement(By.linkText("PIM")));

		wait(1);

		//TakesScreenshot ts = (TakesScreenshot) driver;
		
		TakesScreenshot ts = (TakesScreenshot) driver.findElement(By.id("resultTable"));
		
		File sourse = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("screenshots/table.png");

		try {
			FileUtils.copyFile(sourse, destination);
		} catch (IOException e) {
			System.out.println("Couldn't save the file!");
			e.printStackTrace();
		}

		tearDown();

	}

}
