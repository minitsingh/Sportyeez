package com.tp.scm.objectrepositoryutility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



/**
 * @author MINIT SINGH
 * this pom class is for handling add Category page of admin
 */
public class AdminAddCategoryPage {
	WebDriver driver;
	/**
	 * Constructor
	 * @param driver
	 */
	public AdminAddCategoryPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * Locator strategies object identification
	 */
	@FindBy(name = "txtCategoryName")
	private WebElement categoryNameEdit;
	
	@FindBy(name = "txtCategoryDetails")
	private WebElement categoryDetails;
	
	@FindBy(xpath = "//input[contains(@value,'Category')]")
	private WebElement addCategoryBtn;
	
	/**
	 * object encapsulation and getters method
	 * @return
	 */
	public WebElement getCategoryNameEdit() {
		return categoryNameEdit;
	}

	public WebElement getCategoryDetails() {
		return categoryDetails;
	}
	
	public WebElement getAddCategoryBtn() {
		return addCategoryBtn;
	}

	/**
	 * Object Utilization, business action
	 * @param categoryName
	 * @param detail
	 * @throws InterruptedException 
	 */
	public void addNewCategory(String categoryName,String detail) throws InterruptedException
	{
		categoryNameEdit.sendKeys(categoryName);
		categoryDetails.sendKeys(detail);
		addCategoryBtn.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}
	
	
}
