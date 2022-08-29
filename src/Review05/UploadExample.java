package Review05;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Utils.CommonMethods;

public class UploadExample extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		String filePath = System.getProperty("user.dir") + "/screenshots/hrm.png";

		driver.findElement(By.id("image_file")).sendKeys(filePath);
		wait(2);

		driver.findElement(By.xpath("//*[@id=\"upload_form\"]/div[2]/input")).click();
		wait(2);

		String expectedText = "File Successfully Uploaded";

		waitForVisibility(driver.findElement(By.xpath("//div[@class='ContactUs']")));

		String actualText = driver.findElement(By.id("upload_response")).getText();

		String destPsth = "screenshots";
		if (expectedText.equals(actualText)) { // We are verifying
			destPsth += "/passed/upload.png";
		} else {
			destPsth += "/failed/upload.png";
		}

		TakesScreenshot ts = (TakesScreenshot) driver;

		File sourse = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(destPsth);

		try {
			FileUtils.copyFile(sourse, destination);
		} catch (IOException e) {
			System.out.println("Couldn't save the file!");
			e.printStackTrace();
		}

		tearDown();

	}

}
