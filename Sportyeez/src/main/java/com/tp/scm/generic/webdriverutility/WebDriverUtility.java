package com.tp.scm.generic.webdriverutility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author MINIT SINGH
 */
public class WebDriverUtility {

	/**
	 * this method is used to provide implicit wait
	 * 
	 * @param driver
	 * @return void
	 */
	public void waitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	/**
	 * this method is for explicit wait which will wait for element to first
	 * intractable
	 * 
	 * @param driver
	 * @param element
	 * @return void
	 */
	public void waitElementPresent(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * this method is for explicit wait for element to be click able first
	 * 
	 * @param driver
	 * @param element
	 * @return void
	 */
	public void waitForExpectedCondition(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * this method is for switching the another tab using URL
	 * 
	 * @param driver
	 * @param partialURL
	 * @return void
	 */
	public void switchToTabOnURL(WebDriver driver, String partialURL) {
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String windowID = it.next();
			driver.switchTo().window(windowID);

			String actual = driver.getCurrentUrl();
			if (actual.contains(partialURL)) {
				break;

			}
		}
	}

	/**
	 * this method is for
	 * 
	 * @param driver
	 * @param partialURL
	 * @return void
	 */
	public void switchToTabOnTitle(WebDriver driver, String partialURL) {
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String windowID = it.next();
			driver.switchTo().window(windowID);

			String actual = driver.getCurrentUrl();
			if (actual.contains(partialURL)) {
				break;
			}
		}
	}

	/**
	 * this method is to switch to frame using index value
	 * 
	 * @param driver
	 * @param index
	 * @return void
	 */
	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	/**
	 * this method is to switch to frame using nameID
	 * 
	 * @param driver
	 * @param nameID
	 * @return void
	 */
	public void switchToFrame(WebDriver driver, String nameID) {
		driver.switchTo().frame(nameID);
	}

	/**
	 * this method is to switch to frame using element
	 * 
	 * @param driver
	 * @param element
	 * @return void
	 */
	public void switchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	/**
	 * this method is used to accept in an alert
	 * 
	 * @param driver
	 * @return void
	 */
	public void switchToAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	/**
	 * this method used to cancel and alert
	 * 
	 * @param driver
	 */
	public void switchToAlertAndCancel(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	/**
	 * this method is used to switch to alert
	 * 
	 * @param driver
	 */
	public void switchToAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	/**
	 * this method is used to handle a dropDown using visible text
	 * 
	 * @param element
	 * @param text
	 * @return void
	 */
	public void select(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	/**
	 * this method is to handle dropDown using index
	 * 
	 * @param element
	 * @param index
	 * @return void
	 */
	public void select(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	/**
	 * this method is used to handle dropDown using value
	 * 
	 * @param element
	 * @param value
	 * @return void
	 */
	public void selectByValue(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	/**
	 * this is the method to perform mouse hover action (to move to an element)
	 * 
	 * @param driver
	 * @param element
	 * @return void
	 */
	public void mousemoveOnElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}


}
