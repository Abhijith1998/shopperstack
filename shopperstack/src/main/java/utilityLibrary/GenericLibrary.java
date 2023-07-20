package utilityLibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericLibrary {

	public void selectDropdown(WebElement ele, String option) {
		Select dropdown = new Select(ele);
		int index;
		int count = 0;
		if (count == 0) {
			try {
				index = Integer.parseInt(option);
				dropdown.selectByIndex(index);
				count++;
			} catch (Exception e) {
				System.out.println("not a index value");
			}
		}
		if (count == 0) {
			try {
				dropdown.selectByValue(option);
			} catch (Exception e) {
				dropdown.selectByVisibleText(option);
			}
		}
	}
	public void switchToIframe() {
		
	}
}
