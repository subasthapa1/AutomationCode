package PajeObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RecruitUsersListpage {
	WebDriver driver;
	
	public RecruitUsersListpage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.XPATH, using=".//*[@id='page-title']/div/a")
	WebElement addUserButton;
	
	@FindBy(how=How.ID, using="status")
	WebElement statusDropdown ;
	
	
	@FindBy(how=How.ID, using="keywords")
	WebElement searchTextField;
	
	@FindBy(how=How.XPATH, using=".//*[@id='searchform']/button[1]")
	WebElement searchButton;
	
	@FindBy(how=How.XPATH, using=".//*[@id='searchform']/button[2]")
	WebElement exportButton;
	
	@FindBy(how=How.LINK_TEXT, using="Home")
	WebElement homeLink;


	@FindBy(how=How.LINK_TEXT, using="Recruiter Users")
	WebElement reccruitUsersLink;
	
	
	public void clickAddUser()
	{
		addUserButton.click();
	}
	
	public void filterList(int index, String searchText)
	{
		Select filterSelect= new Select(statusDropdown);
		
		filterSelect.selectByIndex(index);
		searchTextField.sendKeys(searchText);
		searchButton.click();
	}
}
