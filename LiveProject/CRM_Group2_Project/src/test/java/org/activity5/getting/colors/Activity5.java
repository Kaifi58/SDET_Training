package org.activity5.getting.colors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
	
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
	public void gettingColor() {
		// TODO Auto-generated method stub
		String URL = "http://alchemy.hguy.co/crm";
		String UserId = "admin";
		String Pwd = "pa$$w0rd";
		String colortoVerify ="#534d64";
		
	
        //Launch the CRM Application
		driver.get(URL);
		
		WebElement UserName =     driver.findElement(By.xpath("//*[@id='user_name']"));
		WebElement Password = 	  driver.findElement(By.xpath("//*[@id='username_password']"));
		WebElement LoginButton =  driver.findElement(By.xpath("//*[@id='bigbutton']"));
		
		UserName.sendKeys(UserId);
		Password.sendKeys(Pwd);
		
		LoginButton.click();
		
		String ColorRGB =  driver.findElement(By.xpath("//*[@id='toolbar']/ul")).getCssValue("color");
		String hexColorCode = Color.fromString(ColorRGB).asHex();
		
		System.out.println("Color1"+ColorRGB);
		System.out.println("Color2"+hexColorCode);
		Assert.assertEquals(colortoVerify, hexColorCode);
		
					
			
	}

}
