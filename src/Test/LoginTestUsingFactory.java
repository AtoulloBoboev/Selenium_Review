package Test;

import Pages.LoginPageFactory;
import Utils.CommonMethods;
import Utils.ConfigsReader;

public class LoginTestUsingFactory extends CommonMethods {

	
	public static void main(String[] args) {
		
		setUp();
		
		LoginPageFactory login = new LoginPageFactory();
		
		login.username.sendKeys(ConfigsReader.getProperty("username"));
		login.password.sendKeys(ConfigsReader.getProperty("password"));
		login.loginBtn.click();
		
		wait(2);
		
		tearDown();
		
	}
}
