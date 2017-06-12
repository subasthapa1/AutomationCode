package PajeObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
	WebDriver driver;
	public DashboardPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

//***********************Dropdown declaration****************************************************************
	@FindBy(how=How.XPATH, using=".//*[@id='agent']/span")
	WebElement userManagementDropdown;
	
	@FindBy(how=How.XPATH, using=".//*[@id='provider']")
	WebElement providerManagementDropdown;
	
	@FindBy(how=How.XPATH, using=".//*[@id='news']/span")
	WebElement newsDropdown;
	
	@FindBy(how=How.XPATH, using=".//*[@id='training']/span")
	WebElement userTrainingDropdown;
	
	
	@FindBy(how=How.XPATH, using=".//*[@id='commission']/span")
	WebElement commissionDropdown;
	
	@FindBy(how=How.XPATH, using=".//*[@id='order']/span")
	WebElement orderListDropdown ;
	
	@FindBy(how=How.XPATH, using=".//*[@id='commissioninquiry']/span")
	WebElement commissionEnquiryDropdown;
	
	@FindBy(how=How.XPATH, using=".//*[@id='config']/span")
	WebElement adminConfigDropdown;
	
	@FindBy(how=How.XPATH, using=".//*[@id='config']/span")
	WebElement adminUsrMgmtDropdown ;
	
	@FindBy(how=How.XPATH, using=".//*[@id='marketing']/span")
	WebElement marketingDropdown;
//*******************************************************************************************************
	
	
//*****************************Options of user management*********************************************	
	@FindBy(how=How.XPATH, using=".//*[@id='recruiters']/span")
	WebElement recruitUsersOption ;
	
	@FindBy(how=How.XPATH, using=".//*[@id='representative']/span")
	WebElement representativeUsersOption;
	
	@FindBy(how=How.XPATH, using=".//*[@id='organization']/span")
	WebElement organizationUsersOption;
	
	@FindBy(how=How.XPATH, using=".//*[@id='subuser']")
	WebElement subOrganizationUsersOption;
	
//*****************************Options of user management*********************************************	
	
//*******************************functions of user management****************************************
	public void clickRecruitUsers()
	{
		
		 userManagementDropdown.click();
		 WebDriverWait wait =new WebDriverWait(driver,2);
		 wait.until(ExpectedConditions.elementToBeClickable(recruitUsersOption));
		 recruitUsersOption.click();
	}
	
	public void clickRepresentativeUsers()
	{
		 
		 userManagementDropdown.click();
		 WebDriverWait wait =new WebDriverWait(driver,2);
		 wait.until(ExpectedConditions.elementToBeClickable(representativeUsersOption));
		 representativeUsersOption.click();
	}
	public void clickOrganizationUsers()
	{
		// 
		 userManagementDropdown.click();
		 WebDriverWait wait =new WebDriverWait(driver,2);
		 wait.until(ExpectedConditions.elementToBeClickable(organizationUsersOption));
		 organizationUsersOption.click();
	}
	public void clickSubOrganizationUsers()
	{
		
		 userManagementDropdown.click();
		 WebDriverWait wait =new WebDriverWait(driver,2);
		 wait.until(ExpectedConditions.elementToBeClickable(subOrganizationUsersOption));
		 subOrganizationUsersOption.click();
	}
	//*******************************Functions of user management****************************************
	
}
