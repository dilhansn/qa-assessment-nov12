package com.qa.base;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;



public class UIBasePage {


	 private static WebDriver driver;
	 
	 
	 public void initWebDriver(){
	    ChromeDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    }
	 
	    public void quitWebDriver(){
	        if(driver != null){
	            driver.quit();
	        }
	    }
	    
	    public void openPage(String url){
	        driver.get(url);
	    }

	    public void maximizeWindow(){
	        driver.manage().window().maximize();
	    }

	    
	    public boolean isVisible(By locator){
	        try{
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
	        } catch (Exception e){
	            e.printStackTrace();
	            return false;
	        }
	    }
}
