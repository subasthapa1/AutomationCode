package PajeObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PackagesListPage {
	WebDriver driver;
	public PackagesListPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
//-----------------------------Declaration of elements----------------------------------------------------------
		@FindBy(how=How.XPATH, using=".//*[@id='page-title']/div/a")
		WebElement addPackageButton;

		@FindBy(how=How.XPATH, using=".//*[@id='ss']")
		WebElement statusDropdown;
		
		@FindBy(how=How.XPATH, using=".//*[@id='page-content']/div[3]/div/div[1]/div/form/div[2]/div/div/input")
		WebElement packageSearchBox;
		

		@FindBy(how=How.XPATH, using=".//*[@id='page-content']/div[3]/div/div[1]/div/form/div[2]/div/div/span/button")
		WebElement searchButton;
		
		@FindBy(how=How.LINK_TEXT, using="Home")
		WebElement homeLink;
		
		@FindBy(how=How.LINK_TEXT, using="Packages List")
		WebElement packagesList;
		
		 
//-----------------------------Declaration of elements----------------------------------------------------------		
	
		public void clickHomeLink(){
			   homeLink.click();
		       }
		    
		public void clickPackageListLink(){
		    	packagesList.click();
		    }
		
		public void clickAddPackageButton()
		{
			addPackageButton.click();
		}
		
		public void enterPackageName(String packageName){
			packageSearchBox.clear();
			packageSearchBox.sendKeys(packageName);
		}
		
		public void searchFilter(String status, String packageName){
			Select statusdrp= new Select(statusDropdown);
	        statusdrp.selectByVisibleText(status);
	        
	        enterPackageName(packageName);
	        searchButton.click();
		}
		
}
