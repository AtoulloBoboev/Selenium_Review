package Review03;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import Utils.BaseClass;

public class HendlingTheWindows extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		String parentWindowId = driver.getWindowHandle(); // This will return the unique ID of the current page
		System.out.println(parentWindowId);

		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div/a")).click();

		System.out.println("-----------------------------------------");

		Set<String> allWindowIDs = driver.getWindowHandles(); // This will return all the IDs in a Set

		Iterator<String> it = allWindowIDs.iterator();

		while (it.hasNext()) {
			String windowId = it.next();
			System.out.println(windowId);
			
			if(!windowId.equals(parentWindowId)) {
				driver.switchTo().window(windowId);
			}
		}

		Thread.sleep(1000);

		tearDown();

	}

}
