package Review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchCssSelector {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.amazon.com/");

		// #twotabsearchtextbox -> ("#" - hashtag means the id)
		// input#twotabsearchtextbox -> any input that has the id twotabsearchtextbox

		WebElement searchText = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		searchText.sendKeys("watch");

		WebElement submitButton = driver.findElement(By.cssSelector("#nav-search-submit-button"));
		submitButton.click();

		Thread.sleep(1000);
		driver.close();

	}

}
