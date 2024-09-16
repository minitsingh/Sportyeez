package com.tp.scm.objectrepositoryutility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * @author MINIT SINGH
 */
public class RetailerNewOrderPage {

	WebDriver driver;
	/**
	 * Object Initialization , constructor
	 * @param driver
	 */
	public RetailerNewOrderPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	/**
	 *  object identification, locator strategies
	 */
	@FindBy(xpath = "//input[@id='btnSubmit']")
	private WebElement postOrderBtn;
	
	/**
	 * Object encapsulation , getters methods
	 * @return
	 */
	public WebElement getPostOrderBtn() {
		return postOrderBtn;
	}





	public void placeOrder(String productName,String quantity)
	{
		WebElement quantityEdit = driver.findElement(By.xpath("//td[contains(text(),'"+productName+"')]/parent::tr/td/child::input[@type='text']"));
		
		quantityEdit.sendKeys(quantity);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", postOrderBtn);
		
		
	}
}
