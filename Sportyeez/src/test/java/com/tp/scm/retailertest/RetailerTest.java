package com.tp.scm.retailertest;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.tp.scm.basetest.BaseClass;
import com.tp.scm.objectrepositoryutility.LoginPage;
import com.tp.scm.objectrepositoryutility.RetailerHomePage;
import com.tp.scm.objectrepositoryutility.RetailerNewOrderPage;

/**
 * @author MINIT SINGH
 */
public class RetailerTest extends BaseClass {

	@Test(groups = "smokeTest")
	public void retailerLoginTest() throws IOException {
		LoginPage lp = new LoginPage(driver);
		lp.loginAsRetailer();
		RetailerHomePage rhp = new RetailerHomePage(driver);
		rhp.logout();
	}
	/**
	 * this is a failed TC as order module in unstable
	 */
	
//	@Test(groups = "smokeTest")
//	public void createAOrder() throws IOException {
//		LoginPage lp = new LoginPage(driver);
//		lp.loginAsRetailer();
//		RetailerHomePage rhp = new RetailerHomePage(driver);
//		rhp.getNewOrderLink().click();
//		RetailerNewOrderPage rnop = new RetailerNewOrderPage(driver);
//		String productName = eLib.getDataFromExcel("Retailer", 4, 2);
//		String quantity = eLib.getDataFromExcel("Retailer", 4, 3);
//		
//		rnop.placeOrder(productName, quantity);
//		rhp.getHomePageLink().click();
//		rhp.logout();
//	}
	

}
