package Review04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.CommonMethods;

public class CalendarHendling extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		driver.findElement(By.linkText("Datepicker")).click();

		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		// driver.switchTo().frame(frame);
		switchToFrame(frame); // -> Common methods

		driver.findElement(By.id("datepicker")).click();

		wait(2);
		String expectedMonth = "December 2022";

		while (true) {

			WebElement monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			String monthYearText = monthYear.getText();
			if (monthYearText.equals(expectedMonth)) {
				break;
			}

			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}

		wait(2);

		// Select December 15, 2022
		// driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[5]/a")).click();
		String expectDate = "15";
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (WebElement date : dates) {
			if (date.getText().equals(expectDate)) {
				// I found the correct data
				date.click();
			}
		}

		wait(2);

		tearDown();

	}

}
