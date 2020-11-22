package org.activity1.website.title;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity1 {
	
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass(){
		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\kaiansa1\\Desktop\\SeleniumProject\\CRM_Group2_Project\\Driver\\geckodriver.exe");
        //Create a new instance of the Firefox driver
		driver = new FirefoxDriver();
		
	}
	
	@AfterClass
	public void afterClass(){
		
		//driver.close();
	}

	@Test
	public void WebsiteTitle() throws InterruptedException {
		// TODO Auto-generated method stub
		
		String URL = "http://alchemy.hguy.co/crm";
		
		//Launch the CRM Application
		driver.get(URL);
		Thread.sleep(3000);
		 
	    //Get the Title of the page
		String title = driver.getTitle();
		System.out.println("Title of the CRM Page is :"+title);
		 
		 if (title.matches("SuiteCRM")){
				
			 driver.close();
				
		 }
		 	 		 
	}
	
	

}
