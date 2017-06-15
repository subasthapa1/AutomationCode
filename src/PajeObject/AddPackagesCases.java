package PajeObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddPackagesCases {
	WebDriver driver;
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "./webdrivers/chromedriver.exe");

		  driver =new ChromeDriver();
		  
		     LoginPage objLogin;
			 DashboardPage dbPage;
			 objLogin = new LoginPage(driver);
			 driver.get("http://qa.codefirm.net/system/login");
			 driver.manage().window().maximize(); 
			 
			 objLogin.loginToComlink("admin","123admin@"); //Login
			  
			 WebDriverWait wait = new WebDriverWait(driver, 3);
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Provider Management']")));
			 
			 //Click recruit user 
			 dbPage= new DashboardPage(driver);
			 dbPage.clickPackagesOption();
			 
			 PackagesListPage pl= new PackagesListPage(driver);
			 pl.clickAddPackageButton();
			 
			
	}
	
	@Test
	public void addValidTestPackage(){
		AddPackagePage ap= new AddPackagePage(driver);
		 ap.fillFormfields("My Test Package", "Chartered", "COD12", "active");
	}
}
