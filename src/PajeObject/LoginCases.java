package PajeObject;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
	  LoginFormPage objLogin;
	  driver.get("http://qa.codefirm.net/system/login");
	  driver.manage().window().maximize();
	  WebDriverWait wait = new WebDriverWait(driver, 2);
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div/div/div/form/div/div/button")));
	  objLogin = new LoginFormPage(driver);
	  objLogin.clickLogin();
	  Assert.assertEquals("Error! Username / Password Incorrect", objLogin.getErrorMessage());
	  driver.quit();
	  
  }
  @Test
  public void invalidUsername(){
	  LoginFormPage objLogin;
	  driver.get("http://qa.codefirm.net/system/login");
	  driver.manage().window().maximize();
	  WebDriverWait wait = new WebDriverWait(driver, 2);
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div/div/div/form/div/div/button")));
	  objLogin = new LoginFormPage(driver);
	  objLogin.loginToComlink("admin1","123admin@");
	  Assert.assertEquals("Error! Username / Password Incorrect", objLogin.getErrorMessage());
	  driver.quit();
	  
  }
  @Test
  public void invalidPassword(){
	  LoginFormPage objLogin;
	  driver.get("http://qa.codefirm.net/system/login");
	  driver.manage().window().maximize();
	  WebDriverWait wait = new WebDriverWait(driver, 2);
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div/div/div/form/div/div/button")));
	  objLogin = new LoginFormPage(driver);
	  objLogin.loginToComlink("admin","123admin");
	  Assert.assertEquals("Error! Username / Password Incorrect", objLogin.getErrorMessage());
	  driver.quit();
	  
  }
  @Test
  public void invalidUsernameAndPassword(){
	  LoginFormPage objLogin;
	  driver.get("http://qa.codefirm.net/system/login");
	  driver.manage().window().maximize();
	  WebDriverWait wait = new WebDriverWait(driver, 2);
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div/div/div/form/div/div/button")));
	  objLogin = new LoginFormPage(driver);
	  objLogin.loginToComlink("admin12","123admin@1");
	  Assert.assertEquals("Error! Username / Password Incorrect", objLogin.getErrorMessage());
	  driver.quit();
	  
  }
  @Test
  public void validUsernameAndPassword(){
	  LoginFormPage objLogin;
	  driver.get("http://qa.codefirm.net/system/login");
	  driver.manage().window().maximize();
	  WebDriverWait wait = new WebDriverWait(driver, 2);
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div/div/div/form/div/div/button")));
	  objLogin = new LoginFormPage(driver);
	  objLogin.loginToComlink("admin","123admin@");
	  driver.quit();
  }
  
  @Test
  public void checkLogout(){
	  LoginFormPage objLogin;
	  driver.get("http://qa.codefirm.net/system/login");
	  driver.manage().window().maximize();
	  WebDriverWait wait = new WebDriverWait(driver, 2);
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div/div/div/form/div/div/button")));
	  objLogin = new LoginFormPage(driver);
	  objLogin.loginToComlink("admin","123admin@");
	  DashboardPage dbpg = new DashboardPage(driver);
	  dbpg.clickUserAccountDropdown();
	  dbpg.clickLogoutButton();
	  driver.quit();
	  }
  
  
  @Test(dataProvider = "Authentication")
  public void validUsernameAndPasswordUsingDataProvider(String username, String password){
	  LoginFormPage objLogin;
	  driver.get("http://qa.codefirm.net/system/login");
	  driver.manage().window().maximize();
	  WebDriverWait wait = new WebDriverWait(driver, 2);
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div/div/div/form/div/div/button")));
	  objLogin = new LoginFormPage(driver);
	  objLogin.loginToComlink(username,password);
	  DashboardPage dbpg = new DashboardPage(driver);
	  dbpg.clickUserAccountDropdown();
	  dbpg.clickLogoutButton();
	  driver.quit();
  }
  
  @DataProvider(name="Authentication")
	public static Object[][] credentials(){
		return new Object[][]{{"admin","123admin@"}};
	}

}
