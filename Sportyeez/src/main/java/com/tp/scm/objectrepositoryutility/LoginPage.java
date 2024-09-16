package com.tp.scm.objectrepositoryutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tp.scm.generic.fileutility.FileUtility;
import com.tp.scm.generic.webdriverutility.WebDriverUtility;

/**
 * 
 * @author MINIT SINGH
 * 
 */
public class LoginPage {

	public WebElement getLoginTypeDD() {
		return loginTypeDD;
	}

	WebDriver driver;
	WebDriverUtility wLib = new WebDriverUtility();
	FileUtility fLib = new FileUtility();

	/**
	 * 
	 * @param driver
	 */
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * locator strategies to locate webElement
	 */

	@FindBy(id = "login:username")
	private WebElement usernameEdit;

	@FindBy(id = "login:password")
	private WebElement passwordEdit;

	@FindBy(id = "login:type")
	private WebElement loginTypeDD;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginBtn;

	/**
	 *  object encapsulation and getters method
	 * @return
	 */

	public WebElement getUsernameEdit() {
		return usernameEdit;
	}

	public WebElement getPasswordEdit() {
		return passwordEdit;
	}

	public WebElement getLoginType() {
		return loginTypeDD;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	/**
	 * method to login into the application as admin
	 * 
	 * @throws IOException
	 */
	public void loginAsAdmin() throws IOException {
		wLib.waitForPageToLoad(driver);
		// String URL = fLib.getDataFromPropertiesFile("url");
		String adminUN = fLib.getDataFromPropertiesFile("adminUN");
		String adminPW = fLib.getDataFromPropertiesFile("adminPW");
		String adminType = fLib.getDataFromPropertiesFile("adminType");
		driver.manage().window().maximize();
		// driver.get(URL);
		usernameEdit.sendKeys(adminUN);
		passwordEdit.sendKeys(adminPW);
		wLib.select(loginTypeDD, adminType);
		loginBtn.click();

	}

	public void loginAsManufacturer() throws IOException {
		wLib.waitForPageToLoad(driver);
		// String URL = fLib.getDataFromPropertiesFile("url");
		String manufacturerUN = fLib.getDataFromPropertiesFile("manufacturerUN");
		String manufacturerPW = fLib.getDataFromPropertiesFile("manufacturerPW");
		String manufacturerType = fLib.getDataFromPropertiesFile("manufacturerType");
		driver.manage().window().maximize();
		// driver.get(URL);
		usernameEdit.sendKeys(manufacturerUN);
		passwordEdit.sendKeys(manufacturerPW);
		wLib.select(loginTypeDD, manufacturerType);
		loginBtn.click();

	}

	public void loginAsRetailer() throws IOException {
		wLib.waitForPageToLoad(driver);
		// String URL = fLib.getDataFromPropertiesFile("url");
		String retailerUN = fLib.getDataFromPropertiesFile("retailerUN");
		String retailerPW = fLib.getDataFromPropertiesFile("retailerPW");
		String retailerType = fLib.getDataFromPropertiesFile("retailerType");
		driver.manage().window().maximize();
		// driver.get(URL);
		usernameEdit.sendKeys(retailerUN);
		passwordEdit.sendKeys(retailerPW);
		wLib.select(loginTypeDD, retailerType);
		loginBtn.click();

	}

}
