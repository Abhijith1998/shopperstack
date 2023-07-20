package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Log out")
	private WebElement logoutLink;

	@FindBy(className = "account")
	private WebElement account;

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getAccount() {
		return account;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	@FindBy(partialLinkText = "BOOKS")
	private WebElement booksLink;
	
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computersLink;
	
	@FindBy(partialLinkText = "Desktops")
	private WebElement desktopsLink;
	
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement electronicsLink;
	
	@FindBy(partialLinkText = "APPAREL & SHOES")
	private WebElement apparelAndShoesLink;

	public String getLoggedEmail() {
		return account.getText();
	}
}
