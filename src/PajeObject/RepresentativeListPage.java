package PajeObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RepresentativeListPage {
WebDriver driver;
	
	public RepresentativeListPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

//-----------------------------Declaration of elements----------------------------------------------------------
	@FindBy(how=How.XPATH, using=".//*[@id='page-title']/div/a")
	WebElement addRepresentativeUserButton;


	@FindBy(how=How.XPATH, using=".//*[@id='searchform']/div[1]/select")
	WebElement statusDropdownButton;
	

	@FindBy(how=How.XPATH, using=".//*[@id='searchform']/div[2]/select")
	WebElement recruiterDropdownButton;
	

	@FindBy(how=How.XPATH, using=".//*[@id='searchform']/button[1]") 
	WebElement searchButton;
	
    @FindBy(how=How.XPATH, using=".//*[@id='searchform']/div[3]/input")
    WebElement searchBoxField;
    
	@FindBy(how=How.XPATH, using=".//*[@id='searchform']/button[1]")
	WebElement exportButton;

//-----------------------------Declaration of elements----------------------------------------------------------

	
//-----------------------------Declaration of functions----------------------------------------------------------

	
	public void clickAddRepresentative()
	{
		addRepresentativeUserButton.click();
	}
	
	public void enterRecruiterName(String name){
		searchBoxField.clear();
		searchBoxField.sendKeys(name);
	}
	
	public void filterRepresentative(String status, String selectRecruiter, String recruiter){
		
		//select status dropdown option 
        Select statusdrp= new Select(statusDropdownButton);
        statusdrp.selectByVisibleText(status);
		
       //select recruiter from  dropdown list 
        Select rctr= new Select(recruiterDropdownButton);
		rctr.selectByVisibleText(selectRecruiter);
		
        enterRecruiterName(recruiter);
        searchButton.click();
        
        
	}
}
