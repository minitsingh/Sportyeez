package com.tp.scm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * @author MINIT SINGH
 */
public class AdminAddUnitPage {
	
	WebDriver driver;

	/**
	 * Object initialization , constructor
	 * @param driver
	 */
	public AdminAddUnitPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/**
	 * Object identification ,Locator strategies
	 */
	@FindBy(name = "txtUnitName")
	private WebElement unitNameEdit;
	
	@FindBy(name = "txtunitDetails")
	private WebElement unitDetailsEdit;
	
	@FindBy(xpath = "//input[contains(@value,'Add Uni')]")
	private WebElement addCategoryBtn;

	/**
	 * Object encapsulation and getters method
	 * @return
	 */
	public WebElement getUnitNameEdit() {
		return unitNameEdit;
	}

	public WebElement getUnitDetailsEdit() {
		return unitDetailsEdit;
	}
	
	public WebElement getAddCategoryBtn() {
		return addCategoryBtn;
	}
	
	/**
	 *  Object Utilization , business libraries
	 * @param unitName
	 * @param details
	 */
	public void addNewUnit(String unitName,String details)
	{
		unitNameEdit.sendKeys(unitName);
		unitDetailsEdit.sendKeys(details);
		addCategoryBtn.click();
		driver.switchTo().alert().accept();
	}
	

}
