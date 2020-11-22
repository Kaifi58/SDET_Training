package org.activity7.read.info;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity7 {
	
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
	public void readInfo() throws InterruptedException {
		// TODO Auto-generated method stub
		
		String URL = "http://alchemy.hguy.co/crm";
		String UserId = "admin";
		String Pwd = "pa$$w0rd";
		
			
        // Declare new WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver, 10);
	
        //Launch the CRM Application
		driver.get(URL);
		
		WebElement UserName =     driver.findElement(By.xpath("//*[@id='user_name']"));
		WebElement Password = 	  driver.findElement(By.xpath("//*[@id='username_password']"));
		WebElement LoginButton =  driver.findElement(By.xpath("//*[@id='bigbutton']"));
		
		//send username field value
		UserName.sendKeys(UserId);
		//send password field value
		Password.sendKeys(Pwd);
		
		//login button clicked
		LoginButton.click();
		
		//sales tab
		WebElement SalesTab = driver.findElement(By.xpath("//*[@id='grouptab_0']"));
		wait.until(ExpectedConditions.elementToBeClickable(SalesTab));
		//click on sales tab
		SalesTab.click();
		
	
		WebElement Leadsoption= driver.findElement(By.xpath("//*[@id='moduleTab_9_Leads']"));
		
		//System.out.println("LeadText value is :"+ LeadText.getText());
		
		//click on leads option
		Leadsoption.click();
		Thread.sleep(5000);
	
		
		
		
		WebElement Additionalcell = driver.findElement(By.xpath("//table[contains(@class,'table-responsive')]/tbody/tr[1]/td[10]//following-sibling::span"));
		wait.until(ExpectedConditions.elementToBeClickable(Additionalcell));
		
		 //Click on the additional cell
	     Additionalcell.click();
		 Thread.sleep(6000);
		 //System.out.println("I am able to click now");
		 
		
		 
		 //Get the Mobile No and print
		 WebElement MobileNo = driver.findElement(By.xpath("//*[@id='content']//span[@class='phone']"));
		 
		
		 if(MobileNo.isEnabled()){
			 
			 System.out.println("Mobile No is : " + MobileNo.getText());
		 }
		 
		 else{
		 
				 
			 System.out.println("Mobile No is not present for the lead");
		 }
		 	 
	
	}

}
