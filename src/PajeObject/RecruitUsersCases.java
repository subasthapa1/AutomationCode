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
	}
	
	@Test
	public void addUser(){
		 LoginPage objLogin;
		 DashboardPage dbPage;
		 objLogin = new LoginPage(driver);
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
		 
		 //Fill all the required fields 
		 AddRecruiter rctr= new AddRecruiter(driver);
		 rctr.setAllRequiredFields( "email@gmail.com", "firstName", "lastName", "9846474442","address1", "ktm city", "77777");

		  //Filter user 
		  RecruitUsersListpage ls=new RecruitUsersListpage(driver);
		  ls.filterList(1, "Amish");
		  
	}

}
