package com.tp.scm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * @author MINIT SINGH
 */
public class AdminAddManufacturerPage {
	WebDriver driver;
	/**
	 * object initialization, constructor
	 * @param driver
	 */
	public AdminAddManufacturerPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * Object identification, locator strategies
	 */
	
	@FindBy(id = "manufacturer:name")
	private WebElement manufacturerNameEdit;
	
	@FindBy(id = "manufacturer:email")
	private WebElement manufacturerEmailEdit;
	
	@FindBy(id = "manufacturer:phone")
	private WebElement manufacturerPhNo;
	
	@FindBy(id = "manufacturer:username")
	private WebElement manufacturerUN;
	
	@FindBy (id = "manufacturer:password")
	private WebElement manufacturerPW;
	
	@FindBy (xpath = "//input[contains(@value , 'Manufacturer')]")
	private WebElement addManufacturerBtn;
	
	/**
	 * Object encapsulation , getters method
	 * @return
	 */
	
	public WebElement getManufacturerNameEdit() {
		return manufacturerNameEdit;
	}

	public WebElement getManufacturerEmailEdit() {
		return manufacturerEmailEdit;
	}

	public WebElement getManufacturerPhNo() {
		return manufacturerPhNo;
	}

	public WebElement getManufacturerUN() {
		return manufacturerUN;
	}

	public WebElement getManufacturerPW() {
		return manufacturerPW;
	}
	/**
	 *  Object Utilization , business libraries
	 * @param name
	 * @param email
	 * @param phoneNo
	 * @param username
	 * @param password
	 */
	public void addManufacturer(String name,String email, String phoneNo, String username, String password  )
	{
		manufacturerNameEdit.sendKeys(name);
		manufacturerEmailEdit.sendKeys(email);
		manufacturerPhNo.sendKeys(phoneNo);
		manufacturerUN.sendKeys(username);
		manufacturerPW.sendKeys(password);
		addManufacturerBtn.click();
		driver.switchTo().alert().accept();
	}
}
