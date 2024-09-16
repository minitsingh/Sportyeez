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
public class ManufacturerManageStockPage {
	
	public String productName;
	WebDriver driver;
	public ManufacturerManageStockPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	@FindBy(xpath = "//td[text()='"+productName+"']/parent::tr/child::td/input[@type='text']")
//	private WebElement quantityEdit;
	
	@FindBy (xpath = "//input[@id='btnSubmit']")
	private WebElement updateBtn;
	
	
	public void updateStock(String productName , String quantity)
	{
		WebElement quantityEdit = driver.findElement(By.xpath("//td[text()='"+productName+"']/parent::tr/child::td/input[@type='text']"));
		quantityEdit.clear();
		quantityEdit.sendKeys(quantity);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", updateBtn);
		driver.switchTo().alert().accept();
	}
}
