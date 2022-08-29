package Review01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireForDriver {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://translate.google.com/");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String getTitle = driver.getTitle();
		System.out.println(getTitle);
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
