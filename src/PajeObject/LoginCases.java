package PajeObject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginCases {
	public WebDriver driver;
	

	
  @BeforeMethod
  public void setUp() {
	  //System.setProperty("webdriver.chrome.driver", "./webdrivers/geckodriver.exe");
	 System.setProperty("webdriver.chrome.driver", "./webdrivers/chromedriver.exe");

	  driver =new ChromeDriver();
	  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
  }
  @Test
  public void blankLogin(){
	  LoginPage objLogin;
	  driver.get("http://qa.codefirm.net/system/login");
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div/div/div/form/div/div/button")));
	  objLogin = new LoginPage(driver);
	  objLogin.loginToComlink(" "," ");
	  driver.quit();
	  
  }
  @Test
  public void invalidUsername(){
	  LoginPage objLogin;
	  driver.get("http://qa.codefirm.net/system/login");
	  WebDriverWait wait = new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div/div/div/form/div/div/button")));
	  objLogin = new LoginPage(driver);
	  objLogin.loginToComlink("admin1","123admin@");
	  driver.quit();
	  
  }
  @Test
  public void invalidPassword(){
	  LoginPage objLogin;
	  driver.get("http://qa.codefirm.net/system/login");
	  WebDriverWait wait = new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div/div/div/form/div/div/button")));
	  objLogin = new LoginPage(driver);
	  objLogin.loginToComlink("admin","123admin");
	  driver.quit();
	  
  }
  @Test
  public void invalidUsernameAndPassword(){
	  LoginPage objLogin;
	  driver.get("http://qa.codefirm.net/system/login");
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div/div/div/form/div/div/button")));
	  objLogin = new LoginPage(driver);
	  objLogin.loginToComlink("admin12","123admin@1");
	  driver.quit();
	  
  }
  @Test
  public void validUsernameAndPassword(){
	  LoginPage objLogin;
	  driver.get("http://qa.codefirm.net/system/login");
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div/div/div/form/div/div/button")));
	  objLogin = new LoginPage(driver);
	  objLogin.loginToComlink("admin","123admin@");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  objLogin.doLogout();
	  driver.quit();
  }
  
  @Test(dataProvider = "Authentication")
  public void validUsernameAndPasswordUsingDataProvider(String username, String password){
	  LoginPage objLogin;
	  driver.get("http://qa.codefirm.net/system/login");
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div/div/div/form/div/div/button")));
	  objLogin = new LoginPage(driver);
	  objLogin.loginToComlink(username,password);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  objLogin.doLogout();
	  driver.quit();
  }
  
  @DataProvider(name="Authentication")
	public static Object[][] credentials(){
		return new Object[][]{{"admin","123admin@"}};
	}

}
