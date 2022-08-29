package Review05;

import Pages.WidgetsPageFactory;
import Utils.CommonMethods;

public class UploadTestusingPOM extends CommonMethods {

	public static void main(String[] args) {
		// url=http://uitestpractice.com/Students/Widgets

		setUp();

		// At this point the element are not located
		WidgetsPageFactory widgets = new WidgetsPageFactory();

		String filePath = System.getProperty("user.dir") + "/screenshots/hrm.png";
		widgets.uploadTool.sendKeys(filePath);
		wait(2);

		widgets.uploadBtn.click();
		wait(5);
		
		tearDown();

	}

}
