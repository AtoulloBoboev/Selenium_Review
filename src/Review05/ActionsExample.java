package Review05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utils.CommonMethods;

public class ActionsExample extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		wait(1);

		Actions act = new Actions(driver);
		// act.dragAndDrop(draggable, droppable).perform(); //Don't forget .perform() at
		// the end

		act.clickAndHold(draggable).moveToElement(droppable).release().perform();

		wait(2);

		tearDown();

	}

}
