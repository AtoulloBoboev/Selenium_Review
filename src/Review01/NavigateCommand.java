package Review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommand {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://translate.google.com/");
		Thread.sleep(2000);
		driver.navigate().to("http://google.com/");
		driver.navigate().refresh();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
