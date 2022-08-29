package Review02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.BaseClass;

public class CheckBoxDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		// Go to http://uitestpractice.com/Students/Form
		// Check Single
		// Select all the Hobbies
		// See if they are selected after you select each of them

		setUp();

//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[3]/label[3]/input")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[4]/label[2]/input")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[4]/label[3]/input")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[4]/label[4]/input")).click();

		List<WebElement> radioList = driver.findElements(By.xpath("//input[@name='optradio']"));
		radioList.get(1).click(); // Get the second element from the list and click on it

		List<WebElement> checkBoxList = driver.findElements(By.xpath("//input[@type='checkbox']"));
		// I want to check all of them one-by-one
		for (WebElement checkBox : checkBoxList) {

			if (checkBox.isSelected()) {
				System.out.println("It is selected");
			} else {
				System.out.println("It is NOT selected");
			}

			checkBox.click();

			if (checkBox.isSelected()) {
				System.out.println("It is selected");
			} else {
				System.out.println("It is NOT selected");

			}

			Thread.sleep(2000);
			System.out.println("--------------------------");

		}

		tearDown();

	}
}
