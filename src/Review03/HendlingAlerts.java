package Review03;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.BaseClass;

public class HendlingAlerts extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.findElement(By.id("alert")).click();
		Thread.sleep(1000);

		// Hendling the first alert
		Alert alert = driver.switchTo().alert();
		String alertTxt = alert.getText();
		System.out.println("The text of alert is -> " + alertTxt);
		alert.accept();

		// Hendling Timing Alert
		driver.findElement(By.id("timingAlert")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
		//if the alert is present in 5 seconds, we wait only 5 seconds
		
		alert = driver.switchTo().alert();
		Thread.sleep(1000);
		
		alert.accept();

		Thread.sleep(1000);

		tearDown();
	}

}
