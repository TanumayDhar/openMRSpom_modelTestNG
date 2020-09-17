package com.openMRS.TestNGScripts;


import java.io.IOException;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.openMRS.pages.HomePage;
import com.openMRS.pages.LoginPage;
import com.openMRS.parentPage.Page;

public class LoginTest {



	@Test
	public void LoginTest() throws InterruptedException
	{
		HomePage hp = new HomePage(); 
		LoginPage lp = hp.goToLogin();
		lp.doLogin();

	} 

	@Test

	public void takeScreenshot() throws IOException
	{
		Page.scrn.captureScreenshot("pic");
	}

	@AfterClass
	public void closeBrowser()
	{
		HomePage hp = new HomePage();
		hp.LogOut();
	}

}


