package PajeObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RecruitUsersCases {
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
			  
			 WebDriverWait wait = new WebDriverWait(driver, 3);
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='agent']/span")));
			 
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
         driver.quit();
		 //Filter user 
		 // RecruitUsersListpage ls=new RecruitUsersListpage(driver);
		// ls.filterList(1, "Amish");
		  
	}
	
	@Test(priority=1)
	public void addBlankRecruiterUser(){
		AddRecruiterFormPage rctr= new AddRecruiterFormPage(driver);
		 rctr.setAllRequiredFields( "", "", "", "","", "", "");	
		 driver.quit();
	}
	
	@Test(priority=3)
	public void addExistingRecruiterUser(){
		 
		 
		 //Fill all the required fields 
		 AddRecruiterFormPage rctr= new AddRecruiterFormPage(driver);
		 rctr.setAllRequiredFields( "email1@gmail.com", "firstName", "lastName", "9846474442","address1", "ktm city", "77777");
		 driver.quit();
	}
	@Test(priority=4)
public void addUserUsingFullData()
{
		AddRecruiterFormPage rctr= new AddRecruiterFormPage(driver);
		rctr.setAllfields( "middleName", "address2", 2, "country", "taxId123", "SBI bank", "123442", "12331212121212",  "profileImage",  "status", "emailId@gmail.com",  "firstName",  "lastName",  "123121212122",  "address1", "city","23332");
		driver.quit();
}
	
	
	
	
}
