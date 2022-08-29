package Review05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utils.CommonMethods;

public class ActionTask extends CommonMethods{
	
	public static void main(String[] args) {
		
		setUp();
		
		WebElement firstClick = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));
		WebElement secondClick = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[11]"));
		wait(1);
		
		Actions act = new Actions(driver);
		act.clickAndHold(firstClick).pause(1000).moveToElement(secondClick).release().perform();
		
		
		
		wait(2);
		
		tearDown();
		
	}

}
