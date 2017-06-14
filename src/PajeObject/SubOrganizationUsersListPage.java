package PajeObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SubOrganizationUsersListPage {
    WebDriver driver;
	
	public SubOrganizationUsersListPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

//-----------------------------Declaration of elements----------------------------------------------------------
	@FindBy(how=How.XPATH, using=".//*[@id='page-title']/div/a")
	WebElement addSubUsersButton;


	@FindBy(how=How.XPATH, using=".//*[@id='searchform']/div[1]/select")
	WebElement statusDropdownButton;
	

	@FindBy(how=How.XPATH, using=".//*[@id='searchform']/div[2]/select")
	WebElement organizationDropdownButton;
	
	@FindBy(how=How.XPATH, using=".//*[@id='searchform']/div[3]/input")
	WebElement searchBoxField;
	 
	@FindBy(how=How.XPATH, using=".//*[@id='searchform']/button[1]") 
	WebElement searchButton;
	
   
    
	@FindBy(how=How.XPATH, using=".//*[@id='searchform']/button[2]")
	WebElement exportButton;

//-----------------------------Declaration of elements----------------------------------------------------------

	
//-----------------------------Declaration of functions----------------------------------------------------------

	
	public void clickAddSubUsersButton()
	{
		addSubUsersButton.click();
	}
	
	public void enterSubuserName(String subuserName){
		searchBoxField.clear();
		searchBoxField.sendKeys(subuserName);
	}
	
	public void filterOrganization(String status, String selectOrganization, String subUser){
		
		//select status dropdown option 
        Select statusdrp= new Select(statusDropdownButton);
        statusdrp.selectByVisibleText(status);
		
       //select recruiter from  dropdown list 
        Select org= new Select(organizationDropdownButton);
		org.selectByVisibleText(selectOrganization);
		
		enterSubuserName(subUser);
        searchButton.click();
        
        
	}

}
