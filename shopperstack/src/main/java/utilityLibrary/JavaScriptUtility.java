package utilityLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * 
 * @author abhijith
 *
 */
public class JavaScriptUtility {
	public WebDriver driver;
	
	public JavaScriptUtility(WebDriver driver) {
		this.driver=driver;
	}
	
	public JavascriptExecutor js=(JavascriptExecutor) driver;
	
	public void jsClick(WebElement element) {
		js.executeScript("arguments[0].click();", element);
	}
	
	public void scrollTillBottom() {
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	public void scrollIntoElement(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public void scrollBy(int x,int y) {
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	public void scrollTo(int x,int y) {
		js.executeScript("window.scrollTo("+x+","+y+")");
	}
	
	public void jsClear(WebElement element) {
		js.executeScript("arguments[0].value=''", element);
	}
}
