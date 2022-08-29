package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BaseClass;

public class WidgetsPageFactory {

	// Without page Factory
	// public WebElement uploadTool = driver.findElement(By.id("image_file"));

	// With Page factory
	@FindBy(id = "image_file")
	public WebElement uploadTool;

	// driver.findElement(By.xpath("//*[@id=\"upload_form\"]/div[2]/input"))
	@FindBy(xpath = "//*[@id=\"upload_form\"]/div[2]/input")
	public WebElement uploadBtn;

	public WidgetsPageFactory() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
