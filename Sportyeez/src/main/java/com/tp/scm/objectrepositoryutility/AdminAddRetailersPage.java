package com.tp.scm.objectrepositoryutility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.tp.scm.generic.webdriverutility.WebDriverUtility;
/**
 * @author MINIT SINGH
 */
public class AdminAddRetailersPage {

	WebDriver driver;
	WebDriverUtility wLib = new WebDriverUtility();

	/**
	 * Object initialization , constructor
	 * 
	 * @param driver
	 */
	public AdminAddRetailersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * Object identification , locator strategies
	 */
	@FindBy(name = "txtRetailerUname")
	private WebElement retailerUNEdit;

	@FindBy(name = "txtRetailerPassword")
	private WebElement retailerPWEdit;

	@FindBy(name = "cmbAreaCode")
	private WebElement AreaCodeDD;

	@FindBy(name = "txtRetailerPhone")
	private WebElement retailerPhEdit;

	@FindBy(name = "txtRetailerEmail")
	private WebElement retailerEmailEdit;

	@FindBy(id = "retailer:address")
	private WebElement retailerAddressEdit;

	@FindBy(xpath = "//input[contains(@value,'dd Retailer')]")
	private WebElement addRetailerBtn;

	/**
	 * Object encapsulation , getters method
	 * @return
	 */
	
	public WebElement getRetailerUNEdit() {
		return retailerUNEdit;
	}

	public WebElement getRetailerPWEdit() {
		return retailerPWEdit;
	}

	public WebElement getAreaCodeDD() {
		return AreaCodeDD;
	}

	public WebElement getRetailerPhEdit() {
		return retailerPhEdit;
	}

	public WebElement getRetailerEmailEdit() {
		return retailerEmailEdit;
	}

	public WebElement getRetailerAddressEdit() {
		return retailerAddressEdit;
	}

	public WebElement getAddRetailerBtn() {
		return addRetailerBtn;
	}
	
	/**
	 *  Object Utilization , business libraries
	 * @param username
	 * @param password
	 * @param areaCode
	 * @param phonoNo
	 * @param email
	 * @param address
	 * @throws InterruptedException
	 */
	
	public void addARetailer(String username,String password,String areaCode,String phonoNo,String email,String address) throws InterruptedException {
		retailerUNEdit.sendKeys(username);
		retailerPWEdit.sendKeys(password);
		wLib.select(AreaCodeDD, areaCode);
		retailerPhEdit.sendKeys(phonoNo);
		retailerEmailEdit.sendKeys(email);
		retailerAddressEdit.sendKeys(address);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", addRetailerBtn);
		driver.switchTo().alert().accept();
	}
	
	
	
	
	

}
