package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "Email")
	private WebElement emailTextField;
	
	@FindBy(id = "Password")
	private WebElement passwordTextField;
	
	@FindBy(id = "Login")
	private WebElement loginButton;

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void login(String email,String password) {
		emailTextField.clear();
		emailTextField.sendKeys(email);
		passwordTextField.clear();
		passwordTextField.sendKeys(password);
		loginButton.click();
	}
}
