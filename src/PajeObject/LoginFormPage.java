package PajeObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginFormPage {
	
	WebDriver driver;
	public LoginFormPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
//-------------------------------------------------------------------------------------------------	

	@FindBy(name="username")
	WebElement userNameComlink;
	
	@FindBy(name="password")
	WebElement passwordComlink;
	
	@FindBy(xpath="/html/body/div/div/div/form/div/div/button")
	WebElement loginBtnComlink;
	
	@FindBy(xpath="html/body/div/div/div[1]")
	WebElement toastMessage;
	
//-------------------------------------------------------------------------------------------------	
	public void setUsername(String user){
		userNameComlink.clear();
		userNameComlink.sendKeys(user);
	}
	
	public void setPassword(String passwd){
		passwordComlink.clear();
		passwordComlink.sendKeys(passwd);
	}
 public void clickLogin(){
	 loginBtnComlink.click();
 }
 
 public void loginToComlink(String user, String passwd){
	 this.setUsername(user);
	 this.setPassword(passwd);
	 this.clickLogin();
	 WebDriverWait wait =new WebDriverWait(driver,2); 
	 wait.until(ExpectedConditions.visibilityOf(toastMessage));
	 getErrorMessage();
 }
 
 public String getErrorMessage(){
	 String errorMessage = toastMessage.getText();
	 return errorMessage;
 }

 

}
