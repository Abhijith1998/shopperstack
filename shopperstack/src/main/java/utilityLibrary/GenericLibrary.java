package utilityLibrary;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * @author abhijith
 *
 */
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
	public void switchToFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	
	public void switchToFrame(WebDriver driver,String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	
	public void switchToFrame(WebDriver driver,WebElement ele) {
		driver.switchTo().frame(ele);
	}
	
	public void switchBackToMainFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
}
