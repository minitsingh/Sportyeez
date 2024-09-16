package com.tp.scm.basetest;

import java.io.IOException;
import java.sql.SQLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.tp.scm.generic.databaseutility.DatabaseUtility;
import com.tp.scm.generic.fileutility.ExcelUtility;
import com.tp.scm.generic.fileutility.FileUtility;
import com.tp.scm.generic.webdriverutility.JavaUtility;

public class BaseClass {
	public WebDriver driver=null;
	public static WebDriver sdriver=null;
	public DatabaseUtility dbLib = new DatabaseUtility();
	public FileUtility fLib = new FileUtility();
	public ExcelUtility eLib = new ExcelUtility();
	public JavaUtility jLib = new JavaUtility();
	
	@BeforeSuite
	public void configBS() throws SQLException
	{
		System.out.println("----Connect to DB,  Report Config----");
		dbLib.getDbconnection();
	}
	
	@BeforeClass
	public void configBC() throws IOException
	{
		System.out.println("----Launch the browser----");
		
		String BROWSER = fLib.getDataFromPropertiesFile("browser");

		if (BROWSER.equals("chrome"))
			driver = new ChromeDriver();
		else if (BROWSER.equals("firefox"))
			driver = new FirefoxDriver();
		else if (BROWSER.equals("edge"))
			driver = new EdgeDriver();
		else {
			driver = new ChromeDriver();
		}
		sdriver = driver;
	}
	
	@BeforeMethod
	public void configBM() throws IOException
	{
		System.out.println("----Login----");
		String URL = fLib.getDataFromPropertiesFile("url");
		driver.get(URL);
		
	}
	
	@AfterMethod
	public void configAM()
	{
		System.out.println("---logout----");
	}
	
	@AfterClass
	public void configAC() throws InterruptedException
	{
		System.out.println("----browser closed------");
		driver.quit();
	}
	
	@AfterSuite
	public void configAS() throws SQLException
	{
		System.out.println("---- Close DB,  Report BackUP-----");
		dbLib.closeDbconnection();
	}

}
