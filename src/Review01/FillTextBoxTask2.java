package Review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillTextBoxTask2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://demoqa.com/text-box");

		WebElement fullName = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
		fullName.sendKeys("Atoullo Boboev");

		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("atoullo@gmail.com");

		WebElement currentAddress = driver.findElement(By.cssSelector("#currentAddress"));
		currentAddress.sendKeys("1981 E16th street");

		WebElement permAddrs = driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]"));
		permAddrs.sendKeys("222 west st Manhattan");

		WebElement submit = driver.findElement(By.cssSelector("#submit"));
		submit.click();

		Thread.sleep(1000);
		driver.close();
	}

}
