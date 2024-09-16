package com.tp.scm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * @author MINIT SINGH
 */
public class AdminManageUnitPage {
	
	WebDriver driver;
	/*
	 * Object Initialization ,Constructor
	 */
	public AdminManageUnitPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * Object Identification and locator Strategies
	 */
	
	@FindBy(xpath = "//input[@value='+ Add Unit']")
	private WebElement addUnitBtn;
	
	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement deleteBtn;
	
	
	/**
	 * Object encapsulation , Getters method
	 * @return
	 */
	public WebElement getAddUnitBtn() {
		return addUnitBtn;
	}

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}
	
	
	
	
	

}
