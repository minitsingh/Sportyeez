package com.tp.scm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * @author MINIT SINGH
 */
public class AdminAddDistributorPage {
	WebDriver driver;
	/**
	 * Object Initialization , constructor
	 * @param driver
	 */
	public AdminAddDistributorPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 *  object identification, locator strategies
	 */
	@FindBy(id = "distributor:name")
	private WebElement distributorNameEdit;
	
	@FindBy(id = "distributor:email")
	private WebElement distributorEmailEdit;
	
	@FindBy(id = "distributor:phone")
	private WebElement distributorPhNo;
	
	@FindBy(id = "distributor:address")
	private WebElement distributorAddress;
	
	@FindBy(xpath  = "//input[contains(@value,'istributor')]")
	private WebElement addDistributorBtn;
	
	/** 
	 * Object encapsulation , getters method
	 * @return
	 */
	
	public WebElement getDistributorNameEdit() {
		return distributorNameEdit;
	}
	
	public WebElement getDistributorEmailEdit() {
		return distributorEmailEdit;
	}

	public WebElement getDistributorPhNo() {
		return distributorPhNo;
	}

	public WebElement getDistributorAddress() {
		return distributorAddress;
	}

	public WebElement getAddDistributorBtn() {
		return addDistributorBtn;
	}
	
	/**
	 * Object Utilization Business Action,Libraries
	 * @param name
	 * @param email
	 * @param phoneNo
	 * @param address
	 */
	public void addDistributor(String name,String email,String phoneNo,String address)
	{
		distributorNameEdit.sendKeys(name);
		distributorEmailEdit.sendKeys(email);
		distributorPhNo.sendKeys(phoneNo);
		distributorAddress.sendKeys(address);
		addDistributorBtn.click();
		driver.switchTo().alert().accept();
	}
	

}
