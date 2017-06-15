package PajeObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PackagesTypeListPage {
WebDriver driver;
	
	public PackagesTypeListPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
//-----------------------------Declaration of elements----------------------------------------------------------
		@FindBy(how=How.XPATH, using=".//*[@id='page-title']/div/a")
		WebElement addPackageTypeButton;


		@FindBy(how=How.XPATH, using=".//*[@id='page-content']/div[3]/div/form/div/div[3]/div/input")
		WebElement packageTypeSearchBox;
		

		@FindBy(how=How.XPATH, using=".//*[@id='page-content']/div[3]/div/form/div/div[3]/div/span/button")
		WebElement searchButton;

		@FindBy(how=How.LINK_TEXT, using="Home")
		WebElement homeLink;
		
		@FindBy(how=How.LINK_TEXT, using="Product Type List")
		WebElement productTypeListLink;
			
//-----------------------------Declaration of elements----------------------------------------------------------
	   
		public void clickHomeLink(){
			   homeLink.click();
		       }
		    
		    public void clickProductTypeListLink(){
		    	productTypeListLink.click();
		    }  
		
		
		public void enterPackageType(String packageType){
			packageTypeSearchBox.clear();
			packageTypeSearchBox.sendKeys(packageType);
		}
		
		public void searchPackageType(String packageType){
			enterPackageType(packageType);
			searchButton.click();
			
		}
}
