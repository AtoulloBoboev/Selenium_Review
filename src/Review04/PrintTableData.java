package Review04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.CommonMethods;

public class PrintTableData extends CommonMethods {

	public static void main(String[] args) {

		// go to https://the-internet.herokuapp.com/tables
		// print all data
		setUp();

		int rows = driver.findElements(By.xpath("//table[@id='table2']/tbody/tr")).size();

		int columns = driver.findElements(By.xpath("//table[@id='table2']/tbody/tr[1]/td")).size();

		for (int row = 1; row <= rows; row++) {

			for (int col = 1; col <= columns-1; col++) {
				WebElement el = driver
						.findElement(By.xpath("//table[@id='table2']/tbody/tr[" + row + "]/td[" + col + "]"));

				System.out.print(el.getText() + " | ");
			}

			System.out.println();
		}

		wait(2);

		tearDown();

	}

}
