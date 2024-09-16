package com.tp.scm.manufacturertest;

import java.io.IOException;

import org.testng.annotations.Test;
import com.tp.scm.basetest.BaseClass;
import com.tp.scm.objectrepositoryutility.AdminAddProductPage;
import com.tp.scm.objectrepositoryutility.AdminHomePage;
import com.tp.scm.objectrepositoryutility.LoginPage;
import com.tp.scm.objectrepositoryutility.ManufactureAddProductPage;
import com.tp.scm.objectrepositoryutility.ManufacturerHomePage;

public class manufacturerTest extends BaseClass {

	@Test
	public void manufacturerLoginTest() throws IOException {
		LoginPage lp = new LoginPage(driver);
		lp.loginAsManufacturer();
		ManufacturerHomePage mhp = new ManufacturerHomePage(driver);
		mhp.logout();
	}

	@Test(groups = "smokeTest")
	public void manufacturerAddProductTest() throws IOException {
		LoginPage lp = new LoginPage(driver);
		lp.loginAsManufacturer();
		ManufacturerHomePage mhp = new ManufacturerHomePage(driver);
		mhp.getAddProductsLink().click();
		ManufactureAddProductPage mapp = new ManufactureAddProductPage(driver);
		String productName = eLib.getDataFromExcel("Manufacturer", 4, 2) + jLib.getRandomNumber();
		String price = eLib.getDataFromExcel("Manufacturer", 4, 3).toString();
		String unitType = eLib.getDataFromExcel("Manufacturer", 4, 4).toString();
		String category = eLib.getDataFromExcel("Manufacturer", 4, 5).toString();
		String stockManagement = eLib.getDataFromExcel("Manufacturer", 4, 6).toString();
		String description = eLib.getDataFromExcel("Manufacturer", 4, 7).toString();
		mapp.addAProduct(productName, price, unitType, category, stockManagement, description);
		mhp.getHomePage().click();
		mhp.logout();
	}
	
}
