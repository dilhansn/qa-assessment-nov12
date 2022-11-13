
package com.qa.pages;
import com.qa.base.UIBasePage;
import org.openqa.selenium.By;




public class HomePage extends UIBasePage {
	
	private static final By PAGE_TITLE = By.xpath("//h1[text()=\"Home Page\"]");
	
	
    public boolean isHomePageLoaded(){
        return isVisible(PAGE_TITLE);
    }
}
