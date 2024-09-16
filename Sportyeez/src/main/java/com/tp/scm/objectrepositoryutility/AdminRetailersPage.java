package com.tp.scm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * @author MINIT SINGH
 */
public class AdminRetailersPage {
	
	WebDriver driver;
	/**
	 * Constructor
	 * @param driver
	 * @return 
	 */
	public AdminRetailersPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * Object Identification , Locator Strategies
	 */
	@FindBy(xpath = "//Input[@value='Delete']")
	private WebElement deleteBtn;

}
