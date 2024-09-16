package com.tp.scm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * @author MINIT SINGH
 */
public class RetailerHomePage {

	WebDriver driver;
	/**
	 * Object Initialization , constructor
	 * @param driver
	 */
	public RetailerHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/**
	 * Object Identification , Locator Strategies
	 */
	@FindBy(xpath = "//input[@type='button']")
	private WebElement logoutBtn;
	
	@FindBy(linkText = "New Order")
	private WebElement newOrderLink;
	
	@FindBy(linkText = "Edit Profile")
	private WebElement editProfileLink;
	
	@FindBy(partialLinkText = "Hom")
	private WebElement homePageLink;

	@FindBy(linkText = "Products")
	private WebElement ProductsLink;
	
	@FindBy(linkText = "My Orders")
	private WebElement myOrdersLink;
	
	@FindBy(linkText = "My Invoices")
	private WebElement myInvoiceLink;

	/**
	 * object Encapsulation . getters method
	 * @return
	 */

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	
	
	public WebElement getNewOrderLink() {
		return newOrderLink;
	}


	public WebElement getEditProfileLink() {
		return editProfileLink;
	}


	public WebElement getHomePageLink() {
		return homePageLink;
	}


	public WebElement getProductsLink() {
		return ProductsLink;
	}


	public WebElement getMyOrdersLink() {
		return myOrdersLink;
	}


	public WebElement getMyInvoiceLink() {
		return myInvoiceLink;
	}


	/**
	 * Object Utilization , business Libraries
	 */
	public void logout() {
		logoutBtn.click();
	}

}
