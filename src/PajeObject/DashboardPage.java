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
	
	/*
	 *Here we are writing custom xpath cause there are two elements with same ID and getting same xpath while inspecting 
	 */
	@FindBy(how=How.XPATH, using="//a[@title='Provider Management']")
	WebElement providerManagementDropdown;
	
	
	@FindBy(how=How.XPATH, using=".//*[@id='commission']/span")
	WebElement commissionDropdown;
	
	@FindBy(how=How.XPATH, using=".//*[@id='config']/span")
	WebElement adminConfigDropdown;
	
	@FindBy(how=How.XPATH, using="//a[@title='Admin User Mgm']")
	WebElement adminUsrMgmtDropdown ;
	
//*******************************************************************************************************

//*******************************Single Option declaration**********************************************
	@FindBy(how=How.XPATH, using="//a[@title='News & Announcements']")
	WebElement newsAndAnnouncementOption;
	
	@FindBy(how=How.XPATH, using="//a[@title='User Training']")
	WebElement userTrainingOption;
	
	@FindBy(how=How.XPATH, using="//a[@title='Order List']")
	WebElement orderListOption;
	
	@FindBy(how=How.XPATH, using="//a[@title='Commission Inquiry']")
	WebElement commissionInquiryOption;
	
	@FindBy(how=How.XPATH, using="//a[@title='Marketing']")
	WebElement marketingOption;
	
	@FindBy(how=How.XPATH, using="//a[@title='Admin Dashboard']")
	WebElement adminDashboardOption;
	
//********************************Single Option declaration**********************************************************
	
	
//*****************************Options under user management dropdown************************************************	
	@FindBy(how=How.XPATH, using=".//*[@id='recruiters']/span")
	WebElement recruitUsersOption ;
	
	@FindBy(how=How.XPATH, using=".//*[@id='representative']/span")
	WebElement representativeUsersOption;
	
	@FindBy(how=How.XPATH, using=".//*[@id='organization']/span")
	WebElement organizationUsersOption;
	
	@FindBy(how=How.XPATH, using=".//*[@id='subuser']")
	WebElement subOrganizationUsersOption;
	
//*****************************Options under user management dropdown*************************************************	
	
	
//*******************************user account dropdown****************************************************************
	@FindBy(how=How.XPATH, using=".//*[@id='header-nav-left']/div/a/i")
	WebElement userAccountDropdown;
	
	@FindBy(how=How.XPATH, using=".//*[@id='header-nav-left']/div/div[2]/div/div[1]/div/a")
	WebElement changePasswordLink;
	
	@FindBy(how=How.XPATH, using=".//*[@id='adminlogout']")
	WebElement logoutButton;
	
//*******************************end of user account dropdown****************************************************************

	
//*******************************functions under user account dropdown****************************************************************
      public void clickUserAccountDropdown(){
	    userAccountDropdown.click();
       }
      
      public void clickChangePasswordLink(){
    	  WebDriverWait wait= new WebDriverWait(driver,2);
    	  wait.until(ExpectedConditions.elementToBeClickable(changePasswordLink));
    	  changePasswordLink.click();
      }
      
      public void clickLogoutButton(){
    	  WebDriverWait wait= new WebDriverWait(driver,2);
    	  wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
    	  logoutButton.click();
      }
	
	
//******************************* end of functions under user account dropdown****************************************************************

	
//*****************************Options under provider management dropdown************************************************	
		@FindBy(how=How.XPATH, using="//a[@title='Provider & Packages']")
		WebElement providerAndpackagesOption ;
		
		@FindBy(how=How.XPATH, using="//a[@title='Packages']")
		WebElement packagesOption;
		
		@FindBy(how=How.XPATH, using="//a[@title='Package Type']")
		WebElement packageTypeOption;
		
		@FindBy(how=How.XPATH, using="//a[@title='Package Bundle']")
		WebElement packageBundleOption;
		
//*****************************Options under provider management dropdown*************************************************	
	
//*****************************Options under commission management dropdown************************************************	
		@FindBy(how=How.XPATH, using="//a[@title='Upload Commission']")
		WebElement uploadCommissionOption ;
		
		@FindBy(how=How.XPATH, using="//a[@title='Commission Mgm']")
		WebElement commissionOption;
		
		@FindBy(how=How.XPATH, using="//a[@title='Admin Commission']")
		WebElement adminCommissionOption;
		
		@FindBy(how=How.XPATH, using="//a[@title='PayOut Commission']")
		WebElement PayoutCommission;
		
//*****************************Options under commission management dropdown*************************************************
	
//*****************************Options under admin config management dropdown************************************************	
		@FindBy(how=How.XPATH, using="//a[@title='Settings']")
		WebElement settingsOption ;
			
		@FindBy(how=How.XPATH, using="//a[@title='Email Template']")
		WebElement emailTemplateOption;
			
		@FindBy(how=How.XPATH, using="//a[@title='Language']")
		WebElement languageOption;
			
		@FindBy(how=How.XPATH, using="//a[@title='Log Management']")
		WebElement logManagementOption;	 
				
//*****************************Options under admin config management dropdown*************************************************
			
//*****************************Options under admin user management dropdown************************************************	
		@FindBy(how=How.XPATH, using="//a[@title='Permissions']")
		WebElement  permissionsOption;
				
		@FindBy(how=How.XPATH, using="//a[@title='Roles']")
		WebElement rolesOption;
				
		@FindBy(how=How.XPATH, using="//a[@title='Users']")
		WebElement usersOption;
				
		
				
//*****************************Options under admin user management dropdown*************************************************
			
		
//*******************************functions under user management dropdown****************************************
	public void clickRecruitUsersOption()
	{
		
		 userManagementDropdown.click();
		 WebDriverWait wait =new WebDriverWait(driver,2);
		 wait.until(ExpectedConditions.elementToBeClickable(recruitUsersOption));
		 recruitUsersOption.click();
	}
	
	public void clickRepresentativeUsersOption()
	{
		 
		 userManagementDropdown.click();
		 WebDriverWait wait =new WebDriverWait(driver,2);
		 wait.until(ExpectedConditions.elementToBeClickable(representativeUsersOption));
		 representativeUsersOption.click();
	}
	public void clickOrganizationUsersOption()
	{
		// 
		 userManagementDropdown.click();
		 WebDriverWait wait =new WebDriverWait(driver,2);
		 wait.until(ExpectedConditions.elementToBeClickable(organizationUsersOption));
		 organizationUsersOption.click();
	}
	public void clickSubOrganizationUsersOption()
	{
		
		 userManagementDropdown.click();
		 WebDriverWait wait =new WebDriverWait(driver,2);
		 wait.until(ExpectedConditions.elementToBeClickable(subOrganizationUsersOption));
		 subOrganizationUsersOption.click();
	}
//*******************************Functions under user management dropdown****************************************
	
//*******************************Functions under provider management dropdown***********************************************

	public void clickProviderAndPackagesOption()
	{
		
		providerManagementDropdown.click();
		 WebDriverWait wait =new WebDriverWait(driver,2);
		 wait.until(ExpectedConditions.elementToBeClickable(providerAndpackagesOption));
		 providerAndpackagesOption.click();
	}
	public void clickPackagesOption()
	{
		
		providerManagementDropdown.click();
		 WebDriverWait wait =new WebDriverWait(driver,2);
		 wait.until(ExpectedConditions.elementToBeClickable(packagesOption));
		 packagesOption.click();
	}
	
	public void clickPackageTypeOption()
	{
		
		providerManagementDropdown.click();
		 WebDriverWait wait =new WebDriverWait(driver,2);
		 wait.until(ExpectedConditions.elementToBeClickable(packageTypeOption));
		 packageTypeOption.click();
	}
	
	public void clickPackageBundleOption()
	{
		
		providerManagementDropdown.click();
		 WebDriverWait wait =new WebDriverWait(driver,2);
		 wait.until(ExpectedConditions.elementToBeClickable(packageBundleOption));
		 packageBundleOption.click();
	}
	
	
	
//*******************************Functions under provider management dropdown************************************************
	
	
//*******************************Functions under commission management dropdown***********************************************

	public void clickUploadCommissionOption()
	{
		
		commissionDropdown.click();
		 WebDriverWait wait =new WebDriverWait(driver,2);
		 wait.until(ExpectedConditions.elementToBeClickable(uploadCommissionOption));
		 uploadCommissionOption.click();
	}
	
	public void clickCommissionOption()
	{
		
		commissionDropdown.click();
		 WebDriverWait wait =new WebDriverWait(driver,2);
		 wait.until(ExpectedConditions.elementToBeClickable(commissionOption));
		 commissionOption.click();
	}
	
	public void clickadminCommissionOption()
	{
		
		commissionDropdown.click();
		 WebDriverWait wait =new WebDriverWait(driver,2);
		 wait.until(ExpectedConditions.elementToBeClickable(adminCommissionOption));
		 adminCommissionOption.click();
	}
	public void clickPayoutCommissionOption()
	{
		
		commissionDropdown.click();
		 WebDriverWait wait =new WebDriverWait(driver,2);
		 wait.until(ExpectedConditions.elementToBeClickable(PayoutCommission));
		 PayoutCommission.click();
	}
	
	
//*******************************Functions under commission management dropdown***********************************************
	
	
//*******************************Functions under Admin config management dropdown**********************************************
	public void clickSettingsOption()
	{
		
		adminConfigDropdown.click();
		 WebDriverWait wait =new WebDriverWait(driver,2);
		 wait.until(ExpectedConditions.elementToBeClickable(settingsOption));
		 settingsOption.click();
	}
	
	public void clickEmailTemplateOption()
	{
		
		adminConfigDropdown.click();
		 WebDriverWait wait =new WebDriverWait(driver,2);
		 wait.until(ExpectedConditions.elementToBeClickable(emailTemplateOption));
		 emailTemplateOption.click();
	}
	
	public void clickLanguageOption()
	{
		
		adminConfigDropdown.click();
		 WebDriverWait wait =new WebDriverWait(driver,2);
		 wait.until(ExpectedConditions.elementToBeClickable(languageOption));
		 languageOption.click();
	}
	public void clickLogManagementOption()
	{
		
		adminConfigDropdown.click();
		 WebDriverWait wait =new WebDriverWait(driver,2);
		 wait.until(ExpectedConditions.elementToBeClickable(logManagementOption));
		 logManagementOption.click();
	}
	
	
//*******************************Functions under Admin config management dropdown**********************************************
	
	
//*******************************Functions under Admin user management dropdown*********************************************
	public void clickPermissionsOption()
	{
		
		adminUsrMgmtDropdown.click();
		 WebDriverWait wait =new WebDriverWait(driver,2);
		 wait.until(ExpectedConditions.elementToBeClickable(permissionsOption));
		 permissionsOption.click();
	}
	
	public void clickRolesOption()
	{
		
		adminUsrMgmtDropdown.click();
		 WebDriverWait wait =new WebDriverWait(driver,2);
		 wait.until(ExpectedConditions.elementToBeClickable(rolesOption));
		 rolesOption.click();
	}
	
	public void clickUsersOption()
	{
		
		adminUsrMgmtDropdown.click();
		 WebDriverWait wait =new WebDriverWait(driver,2);
		 wait.until(ExpectedConditions.elementToBeClickable(usersOption));
		 usersOption.click();
	}
	
	
	
//*******************************Functions under Admin user management dropdown*********************************************
	
//****************************function ************************************************************	
	public void clickNewsAndAnnouncementsOption(){
		WebDriverWait wait =new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.elementToBeClickable(newsAndAnnouncementOption));
		newsAndAnnouncementOption.click();
		
	  }
	 
    public void clickUserTrainingOption(){
    	WebDriverWait wait =new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.elementToBeClickable(userTrainingOption));
    	userTrainingOption.click();
		
	   }
    public void clickOrderListOption(){
    	WebDriverWait wait =new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.elementToBeClickable(orderListOption));
    	orderListOption.click();
	
      }
    public void clickCommissionInquiryOption(){
    	WebDriverWait wait =new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.elementToBeClickable(commissionInquiryOption));
    	commissionInquiryOption.click();
	
         }

    public void clickMarketingOption(){
    	WebDriverWait wait =new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.elementToBeClickable(marketingOption));
    	
    	marketingOption.click();
    	
    }
    
    public void clickAdminDashboardOption(){
    	WebDriverWait wait =new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.elementToBeClickable(adminDashboardOption));
    	
		adminDashboardOption.click();
    	
    }
	
//****************************function************************************************************	

	
}
