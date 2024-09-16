package com.tp.scm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tp.scm.generic.webdriverutility.WebDriverUtility;

/**
 * @author MINIT SINGH
 */
public class AdminHomePage {

	WebDriver driver;
	WebDriverUtility wLib = new WebDriverUtility();

	public AdminHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * object identification and locator strategies
	 */
	@FindBy(xpath = "//input[@type='button']")
	private WebElement logoutBtn;

	@FindBy(xpath = "//a[text()='Home']")
	private WebElement HomeLink;

	@FindBy(xpath = "//a[text()='Manufacturers']")
	private WebElement manufacturerslink;

	@FindBy(xpath = "//a[text()='Distributors']")
	private WebElement distributorslink;

	@FindBy(xpath = "//a[text()='Products']")
	private WebElement productslink;

	@FindBy(xpath = "//a[text()='Orders']")
	private WebElement orderslink;

	@FindBy(xpath = "//a[text()='Invoice']")
	private WebElement invoicelink;

	@FindBy(xpath = "//a[text()='Add Products']")
	private WebElement addProdLink;

	@FindBy(xpath = "//a[text()='Add Retailers']")
	private WebElement addRetailerLink;

	@FindBy(xpath = "//a[text()='Add Manufacturer']")
	private WebElement addManufacturerLink;

	@FindBy(xpath = "//a[text()='Add Distributor']")
	private WebElement addDistributorLink;

	@FindBy(xpath = "//a[text()='Manage Unit']")
	private WebElement manageUnitLink;

	@FindBy(xpath = "//a[text()='Manage Category']")
	private WebElement manageCategoryLink;

	@FindBy(xpath = "//a[text()='Manage Area']")
	private WebElement manageAreaLink;

	@FindBy(xpath = "//a[text()='Change Password'")
	private WebElement changepwdLink;
	
	/**
	 * getters method and object encapsulation 
	 * @return
	 */

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

	public WebElement getHomeLink() {
		return HomeLink;
	}

	public WebElement getManufacturerslink() {
		return manufacturerslink;
	}

	public WebElement getDistributorslink() {
		return distributorslink;
	}

	public WebElement getProductslink() {
		return productslink;
	}

	public WebElement getOrderslink() {
		return orderslink;
	}

	public WebElement getInvoicelink() {
		return invoicelink;
	}

	public WebElement getAddProdLink() {
		return addProdLink;
	}

	public WebElement getAddRetailerLink() {
		return addRetailerLink;
	}

	public WebElement getAddManufacturerLink() {
		return addManufacturerLink;
	}

	public WebElement getAddDistributorLink() {
		return addDistributorLink;
	}

	public WebElement getManageUnitLink() {
		return manageUnitLink;
	}

	public WebElement getManageCategoryLink() {
		return manageCategoryLink;
	}

	public WebElement getManageAreaLink() {
		return manageAreaLink;
	}

	public WebElement getChangepwdLink() {
		return changepwdLink;
	}

	/**
	 * Business action,Object utilization
	 */
	public void logout() {
		logoutBtn.click();
	}

}
