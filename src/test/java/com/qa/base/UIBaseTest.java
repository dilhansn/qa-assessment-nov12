package com.qa.base;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class UIBaseTest extends UIBasePage {

	private static final String URL = "htttps://testsite.com";
	
	
	@BeforeTest
	public void openBrowser() {
		
		initWebDriver();
		openPage(URL);
		maximizeWindow();
		
	}
	
	@AfterTest
	public void closeBrowser() {
		
		quitWebDriver();
	}
}
