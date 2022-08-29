package Review03;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import Utils.BaseClass;

public class Task1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div/a")).click();

		// Now we have two windows open
		Set<String> allHendles = driver.getWindowHandles();

		Iterator<String> it = allHendles.iterator();
		String handle1 = it.next();
		String handle2 = it.next();
		System.out.println(handle1);
		System.out.println(handle2);

		for (int i = 0; i < 3; i++) {
			driver.switchTo().window(handle1);
			Thread.sleep(1000);
			driver.switchTo().window(handle2);
			Thread.sleep(1000);
		}

		driver.close(); // Will close only the current window
		Thread.sleep(1000);

		tearDown();
	}

}
