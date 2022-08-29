package Review05;

import Pages.LoginPageFactory;
import Utils.CommonMethods;

public class HWL15_2 extends CommonMethods {

	public static void main(String[] args) {

		// 1. Go to https://opensource-demo.orangehrmlive.com/
		// 2. Enter valid username and wrong password
		// 3. Click on login button
		// 4. Verify error message with text "Invalid credentials" is displayed

		setUp();

		LoginPageFactory login = new LoginPageFactory();

		login.username.sendKeys("asdas");
		login.password.sendKeys("123");
		login.loginBtn.click();

		wait(2);

		String expectedTxt = "Invalid credentials";
		String actualTxt = login.errorMsg.getText();

		if (expectedTxt.equals(actualTxt)) {
			System.out.println("Test passed!");
		} else {
			System.out.println("Test failed");
		}

		wait(2);

		tearDown();

	}

}
