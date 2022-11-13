package com.qa.tests;

import com.qa.base.UIBaseTest;
import com.qa.pages.HomePage;
import org.testng.Assert;


public class TaskOneTest extends UIBaseTest{
	
	HomePage homePage = new HomePage();
   
    private void verifyPageLoad(){
        Assert.assertTrue(homePage.isHomePageLoaded());
    }
    
    
}
