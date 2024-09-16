package com.tp.scm.objectrepositoryutility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.tp.scm.generic.webdriverutility.WebDriverUtility;
/**
 * @author MINIT SINGH
 */
public class ManufactureAddProductPage {
	/**
	 * constructor initializing with the current driver session Object
	 * initialization
	 */
	WebDriver driver;
	WebDriverUtility wLib = new WebDriverUtility();

	public ManufactureAddProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * object identification and locator strategies
	 */

	@FindBy(name = "txtProductName")
	private WebElement prodNameText;

	@FindBy(name = "txtProductPrice")
	private WebElement prodPriceText;

	@FindBy(name = "cmbProductUnit")
	private WebElement prodUnitDD;

	@FindBy(name = "cmbProductCategory")
	private WebElement prodcategoryDD;

	@FindBy(xpath = "//input[@value='1']")
	private WebElement enabledStockBtn;

	@FindBy(xpath = "//input[@value='2']")
	private WebElement disabledStockBtn;

	@FindBy(xpath = "//textarea[@name='txtProductDescription']")
	private WebElement descriptiontextbox;

	@FindBy(xpath = "//input[@value='Add Product']")
	private WebElement addProdBtn;

	/**
	 *  object encapsulation and getters method
	 */

	public WebElement getProdNameText() {
		return prodNameText;
	}

	public WebElement getProdPriceText() {
		return prodPriceText;
	}

	public WebElement getProdUnitDD() {
		return prodUnitDD;
	}

	public WebElement getProdcategoryDD() {
		return prodcategoryDD;
	}

	public WebElement getEnabledStockBtn() {
		return enabledStockBtn;
	}

	public WebElement getDisabledStockBtn() {
		return disabledStockBtn;
	}

	public WebElement getDescriptiontextbox() {
		return descriptiontextbox;
	}

	public WebElement getAddProdBtn() {
		return addProdBtn;
	}
	
	/**
	 *  Object Utilization , business libraries
	 * @param prodName
	 * @param prodPrice
	 * @param unitType
	 * @param prodCategory
	 * @param stockManagement
	 * @param description
	 * @throws InterruptedException 
	 */
	public void addAProduct(String prodName,String prodPrice,String unitType,String prodCategory,String stockManagement,String description) throws InterruptedException
	{
		prodNameText.sendKeys(prodName);
		prodPriceText.sendKeys(prodPrice);
		wLib.select(prodUnitDD, unitType);
		wLib.select(prodcategoryDD, prodCategory);
		
		if(stockManagement.contains("Enabled")) {
		enabledStockBtn.click();
		}
		else
		{
			disabledStockBtn.click();
		}
		
		descriptiontextbox.sendKeys(description);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", addProdBtn);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
	}

}
