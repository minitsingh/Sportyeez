package com.tp.scm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * @author MINIT SINGH
 */
public class AdminProductsPage {
	

	WebDriver driver;
	/**
	 * Object Initialization , constructor
	 * @param driver
	 */
	public AdminProductsPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 *  object identification, locator strategies
	 */

	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement deleteBtn;


}
