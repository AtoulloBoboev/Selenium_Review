package Review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.BaseClass;

public class HendlingFrames extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[22]/a")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/a")).click();
		Thread.sleep(1000);
		
		//1st way, by index
		//driver.switchTo().frame(0);
		
		//2nd way. switching by Id or by Name
		//driver.switchTo().frame("mce_0_ifr");
		
		//3d way, switching by element
		WebElement frameElement = driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(frameElement);
		Thread.sleep(1000);
		
		driver.findElement(By.id("tinymce")).clear();
		Thread.sleep(1000);
		
		driver.findElement(By.id("tinymce")).sendKeys("What's up Flori?");
		Thread.sleep(1000);
		
		//This will raise an exception, because we are inside the frame
		//driver.findElement(By.linkText("Elemental Selenium")).click();
		
		//We have to switch the focus to the main page
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Elemental Selenium")).click();
		
		Thread.sleep(1000);
		driver.quit();
		//tearDown();
		
	}
}
