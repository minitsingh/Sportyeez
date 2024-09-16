package com.tp.scm.retailertest;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.tp.scm.basetest.BaseClass;
import com.tp.scm.objectrepositoryutility.LoginPage;
import com.tp.scm.objectrepositoryutility.RetailerHomePage;

@Listeners(com.tp.scm.listenersutility.ListernerImpClass.class)

public class RetailerTest extends BaseClass {

	@Test
	public void retailerLoginTest() throws IOException {
		LoginPage lp = new LoginPage(driver);
		lp.loginAsRetailer();
		RetailerHomePage rhp = new RetailerHomePage(driver);
		Assert.fail();
		rhp.logout();
	}

}
