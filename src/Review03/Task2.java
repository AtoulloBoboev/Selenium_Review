package Review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.BaseClass;

public class Task2 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

		// Go to https://the-internet.herokuapp.com/
		// Go to the frame with name framest-middle
		// Go to the frame with index 1
		// Check the that text of the body is MIDDLE

		setUp();
		
		driver.findElement(By.linkText("Frames")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Nested Frames")).click();
		Thread.sleep(1000);
		
		driver.switchTo().frame("frame-top");
		Thread.sleep(1000);
		
		driver.switchTo().frame("frame-middle");
		WebElement middleTxt = driver.findElement(By.id("content"));
		System.out.println(middleTxt.getText());
		Thread.sleep(2000);
		
		tearDown();

	}

}
