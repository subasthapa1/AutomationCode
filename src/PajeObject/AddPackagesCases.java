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
		  
		     LoginFormPage objLogin;
			 DashboardPage dbPage;
			 objLogin = new LoginFormPage(driver);
			 driver.get("http://qa.codefirm.net/system/login");
			 driver.manage().window().maximize(); 
			 
			 objLogin.loginToComlink("admin","123admin@"); //Login
			  
			 //WebDriverWait wait = new WebDriverWait(driver, 3);
			 //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Provider Management']")));
			 
			 //Click recruit user 
			 dbPage= new DashboardPage(driver);
			 dbPage.clickPackagesOption();
			 
			 PackagesListPage pl= new PackagesListPage(driver);
			 pl.clickAddPackageButton();
			 
			
	}
	
	@Test(priority=5)
	public void addExistingPackage(){
		AddPackageFormPage ap= new AddPackageFormPage(driver);
		 ap.fillFormfields("Silver", "Chartered", "COD12345", "inactive");
		 driver.close();
	}
	
	@Test(priority=2)
	public void addExistingCodePackage(){
		AddPackageFormPage ap= new AddPackageFormPage(driver);
		 ap.fillFormfields("My Package", "Chartered", "COD1234", "inactive");
		 driver.close();
	}
	@Test(priority=1)
	public void blankRequiredFieldsInPackage(){
		AddPackageFormPage ap= new AddPackageFormPage(driver);
		 ap.fillFormfields("", "", "", "");
		 driver.close();
	}
	@Test(priority=3)
	public void addBlankPackage(){
		AddPackageFormPage ap= new AddPackageFormPage(driver);
		ap.clickAddPackageButton();
		 driver.close();
	}
	 @Test(priority=4)
	 public void checkbackButton(){
		 
		 AddPackageFormPage pkg= new AddPackageFormPage(driver);
		 pkg.clickBackButton();
		 driver.close();
	 }
	
	
}
