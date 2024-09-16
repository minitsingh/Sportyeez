package com.tp.scm.objectrepositoryutility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tp.scm.generic.webdriverutility.WebDriverUtility;

/**
 * @author MINIT SINGH
 */
public class AdminManageCategoryPage {
	WebDriverUtility wLib = new WebDriverUtility();
	WebDriver driver;
	
	public AdminManageCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/**
	 * Object Identification and locator strategies
	 */
	@FindBy(xpath="//input[contains(@value,'Category')]")
	private WebElement addCategoryBtn;
	
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement delCategoryBtn;

	/**
	 * Encapsulation and getter method
	 * @return
	 */
	
	public WebElement getAddCategoryBtn() {
		return addCategoryBtn;
	}

	public WebElement getDelCategoryBtn() {
		return delCategoryBtn;
	}
	
	public void addCategoryBtnClick()
	{
		WebElement ele = driver.findElement(By.xpath("//input[contains(@value,'Category')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ele);
		driver.switchTo().alert().accept();
	}
	
	

}
