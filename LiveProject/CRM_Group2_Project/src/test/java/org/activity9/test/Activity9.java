package org.activity9.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;import java.util.List;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;



  public class Activity9 {
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
   public void traverseTable() throws InterruptedException  {
	 
	String URL = "http://alchemy.hguy.co/crm";
	String UserId = "admin";
	String Pwd = "pa$$w0rd";
	
	

    //Launch the CRM Application
	driver.get(URL);
	
	WebElement UserName =     driver.findElement(By.xpath("//*[@id='user_name']"));
	WebElement Password = 	  driver.findElement(By.xpath("//*[@id='username_password']"));
	WebElement LoginButton =  driver.findElement(By.xpath("//*[@id='bigbutton']"));
	
	UserName.sendKeys(UserId);
	Password.sendKeys(Pwd);
	
	  LoginButton.click();
	 
	  WebElement home = driver.findElement(By.xpath("//a[@id='grouptab_0']"));	
	  WebDriverWait wait = new WebDriverWait(driver, 50);
	  wait.until(ExpectedConditions.visibilityOf(home));
	  WebElement Leads = driver.findElement(By.xpath("//li/a[@id='moduleTab_9_Leads']"));
	  Actions action = new Actions(driver);
	  action.moveToElement(home).click().build().perform();
	 
	 
	  wait.until(ExpectedConditions.visibilityOf(Leads));
	 
	  action.moveToElement(Leads).click().build().perform();
	  Thread.sleep(5000);
	 
	 
	  WebElement LEADS = driver.findElement(By.xpath("//div[@id='content']"));
	  wait.until(ExpectedConditions.visibilityOf(LEADS));
	 

	
	  
	  List <WebElement> name = driver.findElements(By.xpath("//tr[position()<11]/td[@field='name']"));
	  System.out.println("I am here1");
	  for (WebElement naam : name) {
		  System.out.println("I am here2"); 
	  System.out.println("name: " + naam.getText());
	
	 
	}
	  List <WebElement> user = driver.findElements(By.xpath("//tr[position()<11]/td[@field='assigned_user_name']"));
	  for (WebElement usr : user) {
		 
	  System.out.println("user name: " + usr.getText());
	
	
	}

}
  
}