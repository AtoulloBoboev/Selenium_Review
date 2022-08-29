package Review05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import Utils.CommonMethods;

public class GoogleTest extends CommonMethods {

	// http://www.google.com/
	// Enter a text in search textbox
	// press enter

	public static void main(String[] args) {

		setUp();

		WebElement searchKBox = driver.findElement(By.name("q"));
		searchKBox.sendKeys("iPhone");

		wait(2);

		// Sending keybord KEYS
		searchKBox.sendKeys(Keys.ENTER);

		tearDown();

	}

}
