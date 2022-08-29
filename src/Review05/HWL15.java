package Review05;

import Pages.LoginPageFactory;
import Utils.CommonMethods;

public class HWL15 extends CommonMethods {

	public static void main(String[] args) {

		// 1. Go to https://opensource-demo.orangehrmlive.com/
		// 2. Enter valid username and leave password field empty
		// 3. Click on login button
		// 4. Verify error message with text "Password cannot be empty" is displayed

		setUp();

		LoginPageFactory errMess = new LoginPageFactory();

		errMess.username.sendKeys("admin");
		errMess.password.sendKeys("");
		errMess.loginBtn.click();
		
		wait(2);

		// 1st way, easy way
		// WebElement empt = driver.findElement(By.xpath("//span[@id='spanMessage']"));
		// String exp = empt.getText();
		// System.out.println(exp);

		String expectedTxt = "Password cannot be empty";
		String actualTxt = errMess.errorMsg.getText();

		if (expectedTxt.equals(actualTxt)) {
			System.out.println("Test passed!");
		} else {
			System.out.println("Test failed");
		}

		tearDown();

	}

}
