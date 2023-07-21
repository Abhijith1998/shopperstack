package base;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.HomePage;
import pom.LoginPage;
import utilityLibrary.FrameworkConstants;
import utilityLibrary.InitObjects;
import utilityLibrary.ReadTestData;
/**
 * 
 * @author abhijith
 *
 */
public class BaseTest extends InitObjects implements FrameworkConstants{
	public static WebDriver driver;
	public ReadTestData readData;
	public InitObjects initClass;
	public String url,email,password;
	public LoginPage login_page; 
	public HomePage home_Page;
	public WebDriverWait explicitWait;
	
	
	@BeforeClass(alwaysRun = true)
	public void browserSetup(){
		readData=new ReadTestData();
		String browser=readData.readDataFromPropertyFile("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			Reporter.log("Chrome browser started",true);
		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			Reporter.log("firefox browser started",true);
		}else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			Reporter.log("MSEdge browser started",true);
		}
		driver.manage().window().maximize();
		Reporter.log("browser maximized",true);
		driver.manage().timeouts().implicitlyWait(IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
		initClass=new InitObjects();
	}
	
	@BeforeMethod(alwaysRun = true)
	public void loginToApplication() {
		url=readData.readDataFromPropertyFile("url");
		email=readData.readDataFromPropertyFile("email");
		password=readData.readDataFromPropertyFile("password");
		driver.get(url);
		login_page=new LoginPage(driver);
		explicitWait=new WebDriverWait(driver, EXPLICIT_TIMEOUT);
		explicitWait.until(ExpectedConditions.elementToBeClickable(login_page.getLoginButtonWelcomePage()));
		login_page.getLoginButtonWelcomePage().click();
		login_page.login(email, password);
		Reporter.log("succesfully logged into application",true);
	}
	
	@AfterMethod(alwaysRun = true)
	public void logoutFromApplication() {
		home_Page=new HomePage(driver);
		home_Page.getAccountSettingsButton().click();
		home_Page.getLogoutButton().click();
		Reporter.log("succesfully logged out",true);
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDown() {
		driver.quit();
		Reporter.log("browser closed",true);
	}
}
