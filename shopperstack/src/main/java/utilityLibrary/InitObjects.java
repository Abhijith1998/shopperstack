package utilityLibrary;

import org.openqa.selenium.WebDriver;
/**
 * 
 * @author abhijith
 *
 */
public class InitObjects {
	
	public ReadTestData getReadTestData() {
		return new ReadTestData();
	}
	
	public GenericLibrary getGenericLibrary() {
		return new GenericLibrary();
	}
	
	public JavaScriptUtility getJavaScriptUtility(WebDriver driver) {
		return new JavaScriptUtility(driver);	
	}
	
	public ActionsUtility getActionsUtility(WebDriver driver) {
		return new ActionsUtility(driver);
	}
}
