package Review03;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.BaseClass;

public class DisableEnableDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.findElement(By.xpath("//form[@id=\"input-example\"]/button")).click();

		WebDriverWait enableWait = new WebDriverWait(driver, Duration.ofSeconds(15));
		enableWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id=\"input-example\"]/input")));

		driver.findElement(By.xpath("//form[@id=\"input-example\"]/input")).sendKeys("Hi there");
		driver.findElement(By.xpath("//form[@id=\"input-example\"]/button")).click();

		Thread.sleep(2000);

		tearDown();

	}

}
