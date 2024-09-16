package com.tp.scm.crossmodule;

import org.testng.annotations.Test;

import com.tp.scm.basetest.BaseClass;
import com.tp.scm.objectrepositoryutility.LoginPage;

public class AllModuleTest extends BaseClass {

	@Test
	public void allModuleLoginTest() {
		LoginPage lp = new LoginPage(driver);

	}

}
