package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//button[@aria-label='Account settings']")
	private WebElement accountSettingsButton;
	
	@FindBy(xpath = "//li[text()='My Profile']")
	private WebElement myProfileButton;
	
	@FindBy(xpath = "//li[text()='Wish List']")
	private WebElement wishListButton;
	
	@FindBy(xpath = "//li[text()='My Orders']")
	private WebElement myOrdersButton;
	
	@FindBy(xpath = "//li[text()='My Wallet']")
	private WebElement myWalletButton;
	
	@FindBy(xpath = "//li[text()='My Likes']")
	private WebElement myLikesButton;
	
	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement logoutButton;
	
	@FindBy(id = "cart")
	private WebElement cartButton;
	
	@FindBy(xpath = "//*[name()='svg' and @id='searchBtn']")
	private WebElement searchButton;
	
	@FindBy(id = "search")
	private WebElement searchTextField;

	public WebElement getAccountSettingsButton() {
		return accountSettingsButton;
	}

	public WebElement getMyProfileButton() {
		return myProfileButton;
	}

	public WebElement getWishListButton() {
		return wishListButton;
	}

	public WebElement getMyOrdersButton() {
		return myOrdersButton;
	}

	public WebElement getMyWalletButton() {
		return myWalletButton;
	}

	public WebElement getMyLikesButton() {
		return myLikesButton;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getCartButton() {
		return cartButton;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}
	
}
