package org.activity6.menu.check;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity6 {
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
	public void menuCheck() {
		// TODO Auto-generated method stub
		
		String URL = "http://alchemy.hguy.co/crm";
		String UserId = "admin";
		String Pwd = "pa$$w0rd";
		
		
        //Launch the CRM Application
		driver.get(URL);
		
		WebElement UserName =     driver.findElement(By.xpath("//*[@id='user_name']"));
		WebElement Password = 	  driver.findElement(By.xpath("//*[@id='username_password']"));
		WebElement LoginButton =  driver.findElement(By.xpath("//*[@id='bigbutton']"));
		String tabvalue = "ACTIVITIES";
		
		UserName.sendKeys(UserId);
		Password.sendKeys(Pwd);
		
		LoginButton.click();
		
		WebElement ActivitiesTab = driver.findElement(By.xpath("//*[@id='grouptab_3']"));
		String ActivitiesValue = ActivitiesTab.getText();
		Assert.assertEquals(tabvalue, ActivitiesValue);
		//System.out.println(ActivitiesValue);
		
		if(ActivitiesValue!=null && ActivitiesTab.isEnabled()){
			System.out.println("Tab Exist");
			

		}
	}

}
