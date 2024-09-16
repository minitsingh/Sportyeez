package com.tp.scm.admintest;

import java.io.IOException;
import org.testng.annotations.Test;

import com.tp.scm.basetest.BaseClass;
import com.tp.scm.objectrepositoryutility.AdminAddCategoryPage;
import com.tp.scm.objectrepositoryutility.AdminAddDistributorPage;
import com.tp.scm.objectrepositoryutility.AdminAddManufacturerPage;
import com.tp.scm.objectrepositoryutility.AdminAddProductPage;
import com.tp.scm.objectrepositoryutility.AdminAddRetailersPage;
import com.tp.scm.objectrepositoryutility.AdminAddUnitPage;
import com.tp.scm.objectrepositoryutility.AdminHomePage;
import com.tp.scm.objectrepositoryutility.AdminManageCategoryPage;
import com.tp.scm.objectrepositoryutility.AdminManageUnitPage;
import com.tp.scm.objectrepositoryutility.LoginPage;

/**
 * @author MINIT SINGH
 */
public class adminTest extends BaseClass {

	@Test(groups = "smokeTest")
	public void loginAsAdminTest() throws IOException {
		LoginPage lp = new LoginPage(driver);
		lp.loginAsAdmin();
		AdminHomePage ahp = new AdminHomePage(driver);
		ahp.logout();
	}

	@Test(groups = "smokeTest")
	public void adminAddProductTest() throws IOException {
		LoginPage lp = new LoginPage(driver);
		lp.loginAsAdmin();
		AdminHomePage ahp = new AdminHomePage(driver);
		ahp.getAddProdLink().click();
		AdminAddProductPage aapp = new AdminAddProductPage(driver);
		String productName = eLib.getDataFromExcel("Admin", 4, 2) + jLib.getRandomNumber();
		String price = eLib.getDataFromExcel("Admin", 4, 3).toString();
		String unitType = eLib.getDataFromExcel("Admin", 4, 4).toString();
		String category = eLib.getDataFromExcel("Admin", 4, 5).toString();
		String stockManagement = eLib.getDataFromExcel("Admin", 4, 6).toString();
		String description = eLib.getDataFromExcel("Admin", 4, 7).toString();
		aapp.addAProduct(productName, price, unitType, category, stockManagement, description);
		ahp.getHomeLink();
		ahp.logout();
	}
	
	@Test(groups = "smokeTest")
	public void adminAddRetailerTest() throws IOException, InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.loginAsAdmin();
		AdminHomePage ahp = new AdminHomePage(driver);
		ahp.getAddRetailerLink().click();;
		AdminAddRetailersPage aarp = new AdminAddRetailersPage(driver);
		String username = eLib.getDataFromExcel("Admin", 7, 2)+jLib.getRandomNumber();
		String password = eLib.getDataFromExcel("Admin", 7, 3);
		String areaCode = eLib.getDataFromExcel("Admin", 7, 4);
		String phoneno = eLib.getDataFromExcel("Admin", 7, 5);
		String email = eLib.getDataFromExcel("Admin", 7, 6);
		String address = eLib.getDataFromExcel("Admin", 7, 7);
		aarp.addARetailer(username, password, areaCode, phoneno, email, address);
		ahp.getHomeLink();
		ahp.logout();
	}

	@Test(groups = "smokeTest")
	public void adminManageUnitTest() throws IOException {
		LoginPage lp = new LoginPage(driver);
		lp.loginAsAdmin();
		AdminHomePage ahp = new AdminHomePage(driver);
		ahp.getManageUnitLink().click();
		AdminManageUnitPage amup = new AdminManageUnitPage(driver);
		amup.getAddUnitBtn().click();
		AdminAddUnitPage aaup = new AdminAddUnitPage(driver);
		String unitName = eLib.getDataFromExcel("Admin", 10, 2).toString();
		String details = eLib.getDataFromExcel("Admin", 10, 3).toString();
		System.out.println(unitName);
		System.out.println(details);
		aaup.addNewUnit(unitName, details);
		ahp.getHomeLink();
		ahp.logout();
	}

	@Test(groups = "smokeTest")
	public void adminManageCategoryTest() throws IOException {
		LoginPage lp = new LoginPage(driver);
		lp.loginAsAdmin();
		AdminHomePage ahp = new AdminHomePage(driver);
		ahp.getManageCategoryLink().click();
		AdminManageCategoryPage amcp = new AdminManageCategoryPage(driver);
		amcp.addCategoryBtnClick();
		AdminAddCategoryPage aacp = new AdminAddCategoryPage(driver);
		String categoryName = eLib.getDataFromExcel("Admin", 13, 2).toString();
		String details = eLib.getDataFromExcel("Admin", 13, 3).toString();
		System.out.println(categoryName);
		System.out.println(details);
		aacp.addNewCategory(categoryName, details);
		ahp.getHomeLink();
		ahp.logout();
	}
	@Test(groups = "smokeTest")
	public void adminAddManufacturer() throws IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.loginAsAdmin();
		AdminHomePage ahp = new AdminHomePage(driver);
		ahp.getAddManufacturerLink().click();;
		AdminAddManufacturerPage aamp = new AdminAddManufacturerPage(driver);
		String name = eLib.getDataFromExcel("Admin", 16, 2);
		String email = eLib.getDataFromExcel("Admin", 16, 3);
		String phoneNo = eLib.getDataFromExcel("Admin", 16, 4);
		String username = eLib.getDataFromExcel("Admin", 16, 5);
		String password = eLib.getDataFromExcel("Admin", 16, 6);
		aamp.addManufacturer(name, email, phoneNo, username, password);
		ahp.getHomeLink();
		ahp.logout();
	}
	
	@Test(groups = "smokeTest")
	public void adminAddDistributor() throws IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.loginAsAdmin();
		AdminHomePage ahp = new AdminHomePage(driver);
		ahp.getAddDistributorLink().click();
		AdminAddDistributorPage aadp = new AdminAddDistributorPage(driver);
		String name = eLib.getDataFromExcel("Admin", 19, 2);
		String email = eLib.getDataFromExcel("Admin", 19, 3);
		String phoneNo = eLib.getDataFromExcel("Admin", 19, 4);
		String address = eLib.getDataFromExcel("Admin", 19, 5);
		aadp.addDistributor(name, email, phoneNo, address);
		ahp.getHomeLink();
		ahp.logout();
	}
}
