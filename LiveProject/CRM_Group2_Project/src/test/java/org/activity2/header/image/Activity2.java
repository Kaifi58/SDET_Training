package org.activity2.header.image;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {

	WebDriver driver;
	
	@BeforeClass
	public void beforeClass(){
		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\kaiansa1\\Desktop\\SeleniumProject\\CRM_Group2_Project\\Driver\\geckodriver.exe");
        //Create a new instance of the Firefox driver
		driver = new FirefoxDriver();
		
	}
	
	@AfterClass
	public void afterClass(){
		
		driver.close();
	}
	
	@Test
	public void headerImage() {
		// TODO Auto-generated method stub
		
		String URL = "http://alchemy.hguy.co/crm";
		
		
        //Launch the CRM Application
		driver.get(URL);
		
		//Get the url
		String CurrentUrl= driver.getCurrentUrl();
		//print the url
		System.out.println("URL link :"+CurrentUrl);
		
		
	}

}
