package org.activity3.copyright.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
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
	public void copyrightText() {
		// TODO Auto-generated method stub
		
		String URL = "http://alchemy.hguy.co/crm";
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\kaiansa1\\Desktop\\SeleniumProject\\CRM_Group2_Project\\Driver\\geckodriver.exe");
        //Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
	
        //Launch the CRM Application
		driver.get(URL);
		
		//copyright text
		WebElement text= driver.findElement(By.id("admin_options"));
		System.out.println("footer 1st text present :"+text.getText());
		
		
		
	}

}
