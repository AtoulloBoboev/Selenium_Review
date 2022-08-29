package Review04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.CommonMethods;

public class WebTablePractice extends CommonMethods {

	public static void main(String[] args) {

		// http://testingpool.com/data-types-in-java/
		// Find the number of rows
		// Find the number of columns

		setUp();

		// Find the number of rows
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		int rowSize = rows.size();
		System.out.println("The row size is -> " + rowSize);

		// Find the number of columns
		List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		int colSize = columns.size();
		System.out.println("The column size is -> " + colSize);
		System.out.println();
		System.out.println("-------------------------");

		//
		List<WebElement> dbl = driver.findElements(By.xpath("//table/tbody/tr[7]"));
		for (WebElement d : dbl) {
			System.out.print(d.getText());
		}

		System.out.println();
		System.out.println("-------------------------");
		
		System.out.println("1st way -> static way, getting data drom the first row");
		List<WebElement> headerList = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		for (WebElement el : headerList) {
			System.out.print(el.getText() + ", ");
		}
		System.out.println();

		System.out.println("2nd way -> Dynamic way, getting data from the first row");
		for (int i = 1; i <= 4; i++) {
			WebElement cell = driver.findElement(By.xpath("//table/tbody/tr[1]/td[" + i + "]"));
			System.out.print(cell.getText() + " | ");
		}
		
		System.out.println();
		System.out.println("-------------------------");
		
		System.out.println("Dynamic data, getting data from the first column");
		for (int row = 2; row <= rows.size(); row++) {
			WebElement col = driver.findElement(By.xpath("//table/tbody/tr[" + row + "]/td[1]"));
			System.out.println(col.getText());
		}
		
		System.out.println();
		System.out.println("-------------------------");

		wait(2);

		tearDown();

	}

}
