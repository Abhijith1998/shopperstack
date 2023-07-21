package utilityLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
/**
 * 
 * @author abhijith
 *
 */

public class ActionsUtility {
	
	public WebDriver driver;
	
	public ActionsUtility(WebDriver driver) {
		this.driver=driver;
	}
	Actions action=new Actions(driver);
	
	public void moveOnElement(WebElement ele) {
		action.moveToElement(ele).perform();
	}
	
	public void moveByOffset(int x,int y){
		action.moveByOffset(x, y).perform();
	}
	public void doubleClickOnElement(WebElement ele) {
		action.doubleClick(ele).perform();
	}
	public void dragAndDropElement(WebElement src,WebElement target) {
		action.dragAndDrop(src, target).perform();
	}
}
