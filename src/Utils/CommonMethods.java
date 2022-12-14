package Utils;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends BaseClass {

	/**
	 * This method clears a textbox and send the new text to it
	 * 
	 * @param element
	 * @param text
	 */

	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);

	}

	/**
	 * The method checks if radio/checkbox is enabled and thenclicks on the element
	 * that has the value we want.
	 * 
	 * @param listElement
	 * @param value
	 */

	public static void clickRadioOrCheckbox(List<WebElement> listElement, String value) {

		String actualValue;

		for (WebElement el : listElement) {
			actualValue = el.getAttribute("value").trim();
			if (el.isEnabled() && actualValue.equals(value)) {
				el.click();
				break;
			}
		}
	}

	/**
	 * This method puts the thread to sleep and handles the exception for us.
	 * 
	 * @param second
	 */

	public static void wait(int second) {
		try {
			Thread.sleep(second * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method will check if a desired text is found in the dropdown and only
	 * then select it.
	 * 
	 * @param element
	 * @param textToSelect
	 */

	public static void selectDropdown(WebElement element, String textToSelect) {

		try {

			Select select = new Select(element);
			List<WebElement> options = select.getOptions();

			for (WebElement el : options) {
				if (el.getText().equals(textToSelect)) {
					select.selectByVisibleText(textToSelect);
					break;
				}
			}

		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method will check if an index exists in the dropdown and only then
	 * select it.
	 * 
	 * @param element
	 * @param index
	 */

	public static void selectDropdown(WebElement element, int index) {

		try {

			Select select = new Select(element);

			int size = select.getOptions().size();

			if (size > index) {
				select.selectByIndex(index);
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();

		}

	}

	/**
	 * This method accept the alert and will catch the exception if no alert is
	 * present
	 */

	public static void acceptAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}

	}

	/**
	 * This method will dismiss the alert and will catch the exception if no alert
	 * is present.
	 */

	public static void dismissAlert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	/**
	 * This method returns the text of the alert. If no alert is present, the
	 * excepion will be caught and a null will be returned.
	 * 
	 * @return
	 */

	public static String getAlertText() {
		String text = null;

		try {
			Alert alert = driver.switchTo().alert();
			text = alert.getText();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}

		return text;
	}

	/**
	 * 
	 * 
	 * @param text
	 */

	public static void sendAlertText(String text) {

		try {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(text);
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method will switch to a frame using name or id. It will also handle the
	 * NoSuchFrameException
	 * 
	 * @param nameOrId
	 */

	public static void switchToFrame(String nameOrId) {
		try {
			driver.switchTo().frame(nameOrId);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method will switch to a frame using a web element. It will also handle
	 * the NoSuchFrameException.
	 * 
	 * @param index
	 */

	public static void switchToFrame(int index) {
		try {
			driver.switchTo().frame(index);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method will switch to a frame using a web element. It will also handle
	 * the NoSuchFrameException.
	 * 
	 * @param element
	 */
	public static void switchToFrame(WebElement element) {
		try {

			driver.switchTo().frame(element);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method creates a WebDriverWait object and returns it.
	 * 
	 * @return
	 */

	public static WebDriverWait getWaitObject() {
		WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIME);

		return wait;

	}

	/**
	 * This method will implement an explicit wait on an element.
	 * 
	 * @param element
	 * @return
	 */

	public static WebElement waitForClickability(WebElement element) {
		return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * This method will wait for an element to be visible.
	 * 
	 * @param element
	 * @return
	 */

	public static WebElement waitForVisibility(WebElement element) {
		return getWaitObject().until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This method will click on an element and the explicit wait is implemented.
	 * 
	 * @param element
	 * @return
	 */

	public static void click(WebElement element) {
		waitForClickability(element);
		element.click();
	}

	/**
	 * This method casts the driver to JavascriptExecutor and returns it
	 * 
	 * @return
	 */
	public static JavascriptExecutor getJSObject() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js;
	}

	/**
	 * This method will click to the element that is passed using JavascriptExecutor
	 * 
	 * @param element
	 */
	public static void jsClick(WebElement element) {
		getJSObject().executeScript("arguments[0].click()", element);
	}

	/**
	 * This method will scroll the page until the element that is passed becomes
	 * visible
	 * 
	 * @param element
	 */
	public static void scrollToElement(WebElement element) {
		getJSObject().executeScript("arguments[0].scrollIntoView(true)", element);
	}

	/**
	 * This method will scroll the page down based on the passed pixel parameter
	 * 
	 * @param pixel
	 */
	public static void scrollDown(int pixel) {
		getJSObject().executeScript("window.scrollBy(0, " + pixel + ")");
	}

	public static void scrollUp(int pixel) {
		getJSObject().executeScript("window.scrollBy(0, -" + pixel + ")");
	}

	/**
	 * This method will select a date from the calendar
	 * 
	 * @param elements
	 * @param date
	 */
	public static void selectCalendar(List<WebElement> elements, String date) {
		for (WebElement day : elements) {
			if (day.isEnabled()) {
				if (day.getText().equals(date)) {
					day.click();
					break;
				}
			}
		}
	}
}
