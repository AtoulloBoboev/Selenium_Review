package Review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {

		// Open Chrome
		// Navigate to https://www.selenium.dev/
		// Navigate to https://www.amazon.com/
		// Go back and forth 10 times.
		// Use a for loop
		// Wait 1 second between each navigation

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.selenium.dev/");
		// Thread.sleep(1000);

		driver.navigate().to("https://www.amazon.com/");
		// Thread.sleep(1000);

		for (int i = 1; i <= 10; i++) {
			driver.navigate().back();
			Thread.sleep(1000);
			driver.navigate().forward();
			Thread.sleep(1000);
		}

		driver.close();
	}

}
