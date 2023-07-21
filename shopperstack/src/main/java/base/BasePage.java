package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	public WebDriver driver;
	
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(id = "men")
	private WebElement menLink;
	
	@FindBy(id = "women")
	private WebElement womenLink;
	
	@FindBy(id = "kids")
	private WebElement kidsLink;
	
	public WebElement getMenLink() {
		return menLink;
	}

	public WebElement getWomenLink() {
		return womenLink;
	}

	public WebElement getKidsLink() {
		return kidsLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public WebElement getBeautyLink() {
		return beautyLink;
	}

	public WebElement getLoginButtonWelcomePage() {
		return loginButtonWelcomePage;
	}

	@FindBy(id = "electronics")
	private WebElement electronicsLink;
	
	@FindBy(id = "beautyProducts")
	private WebElement beautyLink;
	
	@FindBy(id = "loginBtn")
	private WebElement loginButtonWelcomePage;
	
}
