package Review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.amazon.com/");

		// There are 8 locators to the find the elements in the DOM
		// id, name, className, linkText, PartialLinkText, tagName, xPath, cssSelector

		WebElement searchText = driver.findElement(By.id("twotabsearchtextbox"));
		searchText.sendKeys("iPhone 13");

		WebElement searchButton = driver.findElement(By.xpath("//*[@id=\'nav-search-submit-button\']"));
		searchButton.click();

		WebElement clickAmzButton = driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]"));
		clickAmzButton.click();
		
		Thread.sleep(1000);

		driver.close();
	}

}
