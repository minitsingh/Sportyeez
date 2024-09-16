package com.tp.scm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * @author MINIT SINGH
 */
public class ManufacturerHomePage {

	WebDriver driver;
	/**
	 * Object Initialization , constructor
	 * @param driver
	 */
	public ManufacturerHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * Object Identification , Locator Strategies
	 */
	@FindBy(xpath = "//input[@type='button']")
	private WebElement logoutBtn;
	
	@FindBy(linkText = "Add Products")
	private WebElement addProductsLink;
	
	@FindBy(linkText = "Manage Stock")
	private WebElement manageStockLink;
	
	@FindBy(linkText = "Manage Unit")
	private WebElement manageUnitLink;
	
	@FindBy(linkText = "Manage Category")
	private WebElement manageCategoryLink;
	
	@FindBy(linkText = "Home")
	private WebElement homePageLink;
	
	@FindBy(linkText = "Retailers")
	private WebElement retailerDetailsLink;
	
	@FindBy(linkText = "Distributors")
	private WebElement distributorsDetailsLink;
	
	@FindBy(linkText = "Products")
	private WebElement productsDetailLink;
	
	@FindBy(linkText = "Orders")
	private WebElement ordersDetailLink;
	
	@FindBy(linkText = "Invoice")
	private WebElement invoiceDetailsLink;
	
	/**
	 * Object Encapsulation , Getters method
	 */
	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	public WebElement getAddProductsLink() {
		return addProductsLink;
	}
	public WebElement getManageStockLink() {
		return manageStockLink;
	}
	public WebElement getManageUnitLink() {
		return manageUnitLink;
	}
	public WebElement getManageCategoryLink() {
		return manageCategoryLink;
	}
	public WebElement getHomePage() {
		return homePageLink;
	}
	public WebElement getRetailerDetails() {
		return retailerDetailsLink;
	}
	public WebElement getDistributorsDetails() {
		return distributorsDetailsLink;
	}
	public WebElement getProductsDetails() {
		return productsDetailLink;
	}
	public WebElement getOrderPage() {
		return ordersDetailLink;
	}
	public WebElement getInvoiceDetails() {
		return invoiceDetailsLink;
	}
	/**
	 * Object utilization , business action
	 */
	public void logout() {
		logoutBtn.click();
	}

}
