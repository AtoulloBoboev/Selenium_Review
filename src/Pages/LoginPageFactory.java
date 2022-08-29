package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BaseClass;

public class LoginPageFactory {

	@FindBy(id = "txtUsername")
	public WebElement username;

	@FindBy(id = "txtPassword")
	public WebElement password;

	@FindBy(id = "btnLogin")
	public WebElement loginBtn;

	@FindBy(xpath = "//div[@id='divLoginButton']/span")
	public WebElement errorMsg;
	
//	@FindBy(xpath = "//div[@id='divLoginButton']/span")
//	public WebElement invalidCred;

	public LoginPageFactory() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
