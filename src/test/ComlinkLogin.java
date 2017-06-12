package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ComlinkLogin {
	public static void main(String args[]){
		WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver.exe");

	  driver =new ChromeDriver();
	  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("http://qa.codefirm.net/system/login");
	  driver.manage().window().maximize();
	  //xpath=//tagname[@attribute='value']
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("123admin@");
	  driver.findElement(By.xpath("html/body/div/div/div/form/div/div/button")).click();

	 WebDriverWait wait =new WebDriverWait(driver,2);
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='provider']/span")));
	 driver.findElement(By.xpath(".//*[@id='provider']/span")).click();
	 
	 WebElement logoutDropdownIcon = driver.findElement(By.xpath(".//*[@id='header-nav-left']/div/a/i"));
	 wait.until(ExpectedConditions.elementToBeClickable(logoutDropdownIcon));
	 logoutDropdownIcon.click();
	 WebElement logoutBtn= driver.findElement(By.xpath(".//*[@id='adminlogout']"));
	 wait.until(ExpectedConditions.elementToBeClickable(logoutBtn));
	 logoutBtn.click();
	 
	}
}
