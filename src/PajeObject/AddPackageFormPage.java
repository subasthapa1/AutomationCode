package PajeObject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddPackageFormPage {
WebDriver driver;
	
	public AddPackageFormPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
//-----------------------------Declaration of elements----------------------------------------------------------
		@FindBy(how=How.XPATH, using="//input[@name='title']")
		WebElement packageNameField;


		@FindBy(how=How.XPATH, using="//select[@id='provider_id']")
		WebElement providerDropdown;
		

		@FindBy(how=How.XPATH, using="//input[@id='line_item_code']")
		WebElement lineItemCodeField;
		
		@FindBy(how=How.XPATH, using="//input[@value='active']")
		WebElement activeButton;
		
		@FindBy(how=How.XPATH, using="//input[@value='inactive']")
		WebElement inactiveButton;
		
		@FindBy(how=How.XPATH, using=".//*[@id='page-content']/div[3]/div/form/div[7]/div/div/a")
		WebElement backButton;
		
		@FindBy(how=How.XPATH, using=".//*[@id='page-content']/div[3]/div/form/div[7]/div/div/button")
		WebElement addPackageButton;
		
		@FindBy(how=How.LINK_TEXT, using="Home")
		WebElement homeLink;
		
		@FindBy(how=How.LINK_TEXT, using="Package")
		WebElement packageLink;
		
		@FindBy(how=How.LINK_TEXT, using="Create Package")
		
		WebElement createPackageLink;
		
//-----------------------------Declaration of elements----------------------------------------------------------

//-----------------------------Declaration of methods----------------------------------------------------------
        public void clickBackButton(){
        	backButton.click();
        }
        public void clickAddPackageButton(){
        	addPackageButton.click();
        }
		public void enterPackageName(String packageName){
			packageNameField.clear();
			packageNameField.sendKeys(packageName);
		}
		
        public void selectProvider(String provider){
			Select slct=new Select(providerDropdown);
			slct.selectByVisibleText(provider);
		}
        public void enterLineItemCode(String code){
        	lineItemCodeField.clear();
        	lineItemCodeField.sendKeys(code);
           }
       public void selectActiveStatus(){
    	   activeButton.click();
          }
       public void selectInactiveStatus( ){
    	   inactiveButton.click();
             }
       
       public void fillFormfields(String packageName, String provider, String lineItem, String status){
    	   enterPackageName(packageName);
    	   selectProvider(provider);
    	   enterLineItemCode(lineItem);
    	   if( status=="active"){
    		   selectActiveStatus();
    	   }
    	   else{
    		   selectInactiveStatus();
    	   }
    	   
    	   clickAddPackageButton();
       }
//-----------------------------Declaration of methods----------------------------------------------------------
		
}
