package org.testNG.Activity1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity15 {
	
    WebDriver driver;
	
    
	
    @BeforeMethod
	
    public void beforeMethod() {
	
        //Create a new instance of the Firefox driver
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\kaiansa1\\Desktop\\SeleniumProject\\TestNGProject\\Driver\\geckodriver.exe");
        driver = new FirefoxDriver();
	
        
	
        //Open browser
	
        driver.get("https://www.training-support.net");
	
    }
	
 
	
    @Test
	
    public void exampleTestCase() {
	
        // Check the title of the page
	
        String title = driver.getTitle();
	
            
	
        //Print the title of the page
	
        System.out.println("Page title is: " + title);
	
            
	
            //Assertion for page title
	
        Assert.assertEquals("Training Support", title);
	
                    
	
        //Find the clickable link on the page and click it
	
        driver.findElement(By.tagName("a")).click();
	
                    
	
        //Print title of new page
	
        System.out.println("New page title is: " + driver.getTitle());
	
        
	
        Assert.assertEquals(driver.getTitle(), "About Training Support");
	
    }
	
 
	
    @AfterMethod
	
    public void afterMethod() {
	
        //Close the browser
	
        driver.quit();
	
    }
	
 
}
