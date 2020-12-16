package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActORHRM {
	WebDriver driver = new FirefoxDriver();
    WebDriverWait wait ;
    
    
    @Given("^User is on OrangeHRM page$")
    public void OrangePage() {
        //Setup instances
        //driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);
        
        //Open browser
        driver.get("http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login");
    }
    
    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void user_enters_and(String username, String password) throws Throwable {
        //Enter username from Feature file
        driver.findElement(By.id("txtUsername")).sendKeys(username);
        //Enter password from Feature file
        driver.findElement(By.id("txtPassword")).sendKeys(password);
        //Click Login
        driver.findElement(By.xpath("btnLogin")).click();
    }
    
    @Then("^Create new job vacancy$")
    public void CreateJobVacancy() {
        
        //Open browser
        driver.findElement(By.xpath("//body/div[@id='wrapper']/div[2]/ul[1]/li[5]/a[1]/b[1]")).click();
        driver.findElement(By.xpath("//a[@id='menu_recruitment_viewJobVacancy']")).click();
        driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
        driver.findElement(By.xpath("//select[@id='addJobVacancy_jobTitle']")).sendKeys("Automation Test Engineer");
        driver.findElement(By.xpath("//input[@id='addJobVacancy_name']")).sendKeys("Automation Test Engineer");
        driver.findElement(By.xpath("//input[@id='addJobVacancy_hiringManager']")).sendKeys("Aakash Sharma");
        driver.findElement(By.xpath("//input[@id='btnSave']")).click();
    }
    
    @Then("^Verify job vacancy is created$")
    public void VerifyJob() {
        
        //Open browser
        
    }
    @Then("^Add candidate to job$")
    public void AddCandidate() {
        
        //Open browser
        driver.findElement(By.xpath("//body/div[@id='wrapper']/div[2]/ul[1]/li[5]/a[1]/b[1]")).click();
        driver.findElement(By.xpath("//a[@id='menu_recruitment_viewCandidates']")).click();
        driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
        driver.findElement(By.xpath("//input[@id='addCandidate_firstName']")).sendKeys("Nishant");
        driver.findElement(By.xpath("//input[@id='addCandidate_lastName']")).sendKeys("Sharma");
        driver.findElement(By.xpath("//input[@id='addCandidate_email']")).sendKeys("test@test.com");
        driver.findElement(By.xpath("//input[@id='btnSave']")).click();
    }
    
    @Then("^Verify candidate is created$")
    public void VerifyCandidate() {
        
        //Open browser
        
    }
    
    @Then("^Add Employees with details \"(.*)\" \"(.*)\"$")
    public void AddEmployees(String fname, String lname) {
        
        //Open browser
        driver.findElement(By.xpath("//body/div[@id='wrapper']/div[2]/ul[1]/li[2]/a[1]/b[1]")).click();
        driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(fname);
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lname);
        driver.findElement(By.xpath("//input[@id='btnSave']")).click();
    }
  
    
    @Then("^Verify Employees are created$")
    public void VerifyEmployees() {
        
        //Open browser
        
    }
    
    @Then("^Create new job vacancies with details \"(.*)\" \"(.*)\" \"(.*)\"$")
    public void AddJob(String title, String name, String hiringM) {
        
        //Open browser
    	 driver.findElement(By.xpath("//body/div[@id='wrapper']/div[2]/ul[1]/li[5]/a[1]/b[1]")).click();
         driver.findElement(By.xpath("//a[@id='menu_recruitment_viewJobVacancy']")).click();
         driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
         driver.findElement(By.xpath("//select[@id='addJobVacancy_jobTitle']")).sendKeys(title);
         driver.findElement(By.xpath("//input[@id='addJobVacancy_name']")).sendKeys(name);
         driver.findElement(By.xpath("//input[@id='addJobVacancy_hiringManager']")).sendKeys(hiringM);
         driver.findElement(By.xpath("//input[@id='btnSave']")).click();
    }
    @And("^Close the Browser$")
    public void closeBrowser() {
        //Close browser
        driver.close();
    }

}
