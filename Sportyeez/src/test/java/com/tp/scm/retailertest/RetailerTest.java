package com.tp.scm.retailertest;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.tp.scm.basetest.BaseClass;
import com.tp.scm.objectrepositoryutility.LoginPage;
import com.tp.scm.objectrepositoryutility.RetailerHomePage;

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

}
