package PajeObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddRecruitUsersCases {
	WebDriver driver;
	
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "./webdrivers/chromedriver.exe");
		driver =new ChromeDriver();
		
		     LoginFormPage objLogin;
			 DashboardPage dbPage;
			 objLogin = new LoginFormPage(driver);
			 driver.get("http://qa.codefirm.net/system/login");
			 driver.manage().window().maximize(); 
			 
			 objLogin.loginToComlink("admin","123admin@"); //Login
			  
			// WebDriverWait wait = new WebDriverWait(driver, 2);
			 //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='agent']/span")));
			 
			 //Click recruit user 
			 dbPage= new DashboardPage(driver);
			 dbPage.clickRecruitUsersOption();
			 
			 //Click add user button
			 RecruitUsersListpage rc=new RecruitUsersListpage(driver);
			 rc.clickAddUser();	
		  
	}
	
	
	@Test(priority=2)
	public void addNewRecruiterUser(){
		 
		 
		 //Fill all the required fields 
		 AddRecruiterFormPage rctr= new AddRecruiterFormPage(driver);
		
		 rctr.setAllRequiredFields( "email1@gmail.com", "firstName", "lastName", "9846474442","address1", "ktm city", "77777");
         rctr.clickSaveButton();
		 driver.quit();
		 //Filter user 
		 // RecruitUsersListpage ls=new RecruitUsersListpage(driver);
		// ls.filterList(1, "Amish");
		  
	}
	
	@Test(priority=1)
	public void addBlankRecruiterUser(){
		AddRecruiterFormPage rctr= new AddRecruiterFormPage(driver);
		 rctr.clickSaveButton();
		 driver.quit();
	}
	
	@Test(priority=4)
	public void addExistingRecruiterUser(){
		 
		 AddRecruiterFormPage rctr= new AddRecruiterFormPage(driver);
		 rctr.setRecruiterPersonalDetail("test@email.com", "firstName", "middleName", "lastName", "9857585585");
		 rctr.setRecruiterAddress("address1", "address2", "city", "Alaska", "77777");
		 rctr.setAccountDetail("tax123", "Bank of America", "123", "312122121212122");
		 rctr.clickSaveButton();
		 driver.quit();
	}
	@Test(priority=3)
    public void addRecruiterUsingFullData()
      {
		 AddRecruiterFormPage rctr= new AddRecruiterFormPage(driver);
		 rctr.setRecruiterPersonalDetail("test@email.com", "firstName", "middleName", "lastName", "9857585585");
		 rctr.setRecruiterAddress("address1", "address2", "city", "Alaska", "77777");
		 rctr.setAccountDetail("tax123", "Bank of America", "123", "312122121212122");
		 rctr.clickSaveButton();
		 driver.quit();
      }
	
	
	
	
}
