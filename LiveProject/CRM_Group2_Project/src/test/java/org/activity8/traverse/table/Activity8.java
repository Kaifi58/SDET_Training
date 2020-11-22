package org.activity8.traverse.table;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;



	public class Activity8 {
	WebDriver driver;
  
	  @Test
      public void traverseTable() throws InterruptedException {
	  
	  driver.get("https://alchemy.hguy.co/crm");
	  driver.findElement(By.xpath("//div/input[@id='user_name']")).sendKeys("admin");
	  driver.findElement(By.xpath("//div/input[@id='username_password']")).sendKeys("pa$$w0rd");
	  driver.findElement(By.id("bigbutton")).click();
	 
	  WebElement home = driver.findElement(By.xpath("//a[@id='grouptab_0']"));	
	  WebDriverWait wait = new WebDriverWait(driver, 50);
	  wait.until(ExpectedConditions.visibilityOf(home));
	  
	  WebElement Accounts = driver.findElement(By.xpath("//li/a[@id='moduleTab_9_Accounts']"));
	  Actions action = new Actions(driver);
	  action.moveToElement(home).click().build().perform();
	 
	 
	  wait.until(ExpectedConditions.visibilityOf(Accounts));
	 
	  action.moveToElement(Accounts).click().build().perform();
	 
	  Thread.sleep(5000);
	 
	  WebElement ACCOUNTS = driver.findElement(By.xpath("//div[@id='content']"));
	  wait.until(ExpectedConditions.visibilityOf(ACCOUNTS));
	 
	  for (int i=1; i<10; i+= 2) {
	
	
	  WebElement name = driver.findElement(By.xpath("//tr[" + i + "]/td[@field='name']"));
	 
		 
	  System.out.println("name: " + name.getText());
	
	}
	}
	 
	 
		 
     @BeforeClass
     public void beforeClass(){
	    driver = new FirefoxDriver();
  
   } 
     @AfterClass
     public void afterClass(){
	 
	  driver.close();
  }
     
}
