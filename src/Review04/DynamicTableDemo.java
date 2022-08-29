package Review04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.CommonMethods;
import Utils.ConfigsReader;

public class DynamicTableDemo extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
		sendText(userName, ConfigsReader.getProperty("username"));

		WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
		sendText(password, ConfigsReader.getProperty("password"));

		WebElement loginBtn = driver.findElement(By.id("ctl00_MainContent_login_button"));
		click(loginBtn);
		wait(1);

		int rowSize = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr")).size();

		// starting from 2, to skip the header
		for (int i = 2; i < rowSize; i++) {
			// iterating the rows
			WebElement rowEl = driver
					.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[" + i + "]"));
			String rowText = rowEl.getText();

			if (rowText.contains("FamilyAlbum")) {
				// I want ot click on the firdt column
				WebElement firstCol = driver
						.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[" + i + "]/td[1]"));

				firstCol.click();

			}

		}

		wait(2);

		WebElement deleteBtn = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
		click(deleteBtn);

		wait(2);

		tearDown();

	}

}
