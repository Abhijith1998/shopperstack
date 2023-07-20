package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class BooksPage extends BasePage{

	public BooksPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "products-orderby")
	private WebElement sortByDropdown;
	
	@FindBy(id = "products-pagesize")
	private WebElement displayDropdown;
	
	public WebElement getSortByDropdown() {
		return sortByDropdown;
	}

	public WebElement getDisplayDropdown() {
		return displayDropdown;
	}

	public WebElement getViewAsDropdown() {
		return viewAsDropdown;
	}

	@FindBy(id = "products-viewmode")
	private WebElement viewAsDropdown;
	
}
