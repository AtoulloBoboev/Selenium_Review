package Review03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utils.BaseClass;

public class DropDownDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		WebElement ddElement = driver.findElement(By.id("dropdown"));

		Select ddSelect = new Select(ddElement);

		// we can select the option in 3 different ways

		// 1st way, selectByValue
		ddSelect.selectByValue("1");
		Thread.sleep(2000);

		// 2nd way, selectByIndex
		ddSelect.selectByIndex(0); // It doesn't select because it is disabled
		Thread.sleep(2000);

		// 3d way, selectByVisibleText
		ddSelect.selectByVisibleText("Option 1");
		Thread.sleep(2000);

		List<WebElement> options = ddSelect.getOptions();

		System.out.println("-------There are " + options.size() + " options-------");

		for (WebElement op : options) {
			System.out.println("Option text -> " + op.getText());
		}

		Thread.sleep(2000);

		tearDown();

	}

}
