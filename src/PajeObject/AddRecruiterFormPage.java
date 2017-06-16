package PajeObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddRecruiterFormPage {
	public WebDriver driver;
	public AddRecruiterFormPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

//*********************form element declaration**********************************************************************
	@FindBy(how=How.ID, using="enterEmail")
	public WebElement emailField;
	
	@FindBy(how=How.ID, using="first_name")
	public WebElement firstNameField;
	
	@FindBy(how=How.ID, using="middle_name")
	public WebElement middleNameField;
	
	@FindBy(how=How.ID, using="last_name")
	public WebElement lastNameField;
	
	@FindBy(how=How.ID, using="phone")
	public WebElement phoneField;
	
	@FindBy(how=How.XPATH, using="//input[@name='addr_line1']")
	public WebElement addressLineField1;
	
	@FindBy(how=How.XPATH, using="//input[@name='addr_line2']")
	public WebElement addressLineField2;
	
	@FindBy(how=How.XPATH, using=".//*[@id='locality']")
	public WebElement cityField;
	
	//Add select dropdown locator in near future.
	@FindBy(how=How.XPATH, using=".//*[@id='administrative_area_level_1']")
	public WebElement stateDropdownField;
	
	@FindBy(how=How.ID, using="postal_code")
	public WebElement zipCodeField;
	
	@FindBy(how=How.ID, using="tax_id")
	public WebElement taxIdField;
	
	@FindBy(how=How.ID, using="bank_name")
	public WebElement bankNameField;
	
	@FindBy(how=How.ID, using="routing_number")
	public WebElement routingNumberField;
	
	@FindBy(how=How.ID, using="account_number")
	public WebElement accountNumberField;
	
	
	@FindBy(how=How.ID, using="profile_pic")
	public WebElement profilePicField;
	
	@FindBy(how=How.XPATH, using=".//*[@id='page-content']/div[3]/div/form/div[18]/div/div/button")
	public WebElement saveButton;
	
	
//*********************form element declaration**********************************************************************
	
//*********************Manupulation on form elements**********************************************************************
	
   public void setEmailField(String email ){
	   emailField.clear();
	   emailField.sendKeys(email);
	   }
    
   public void setFirstNameField(String firstName){
	   firstNameField.clear();
	   firstNameField.sendKeys(firstName);
        }

   public void setMiddleNameField(String middleName ){
	   middleNameField.clear();
	   middleNameField.sendKeys(middleName);
       }

   public void setLastNameField(String lastName){
	   lastNameField.clear();
	   lastNameField.sendKeys(lastName);
     }

   public void setPhoneField(String phone){
	   phoneField.clear();
	  phoneField.sendKeys(phone);
      }

   public void setAddress1Field(String address1 ){
	   addressLineField1.clear();
	   addressLineField1.sendKeys(address1);
       }

   public void setAddress2Field(String address2){
	   addressLineField2.clear();
	   addressLineField2.sendKeys(address2);
      }

   public void setCityField(String city){
	   cityField.clear();
	   cityField.sendKeys(city);
       }

   public void setZipCodeField(String zipCode){
	   zipCodeField.clear();
	   zipCodeField.sendKeys(zipCode);
      }

   public void setTaxIdField(String taxId){
	   taxIdField.clear();
	   taxIdField.sendKeys(taxId);
      }

   public void setBankNameField(String bankName){
	   bankNameField.clear();
	   bankNameField.sendKeys(bankName);
     }

public void setRoutingNumberField(String routingNumber){
	routingNumberField.clear();
	routingNumberField.sendKeys(routingNumber);
}

public void setAccountNumberField(String accountNumber){
	accountNumberField.clear();
	accountNumberField.sendKeys(accountNumber);
}

public void setProfileImageField(String profileImage){
	profilePicField.clear();
	profilePicField.sendKeys(profileImage);
}

public void setStateField(int index){
	Select drpdwn= new Select(stateDropdownField);
	drpdwn.selectByIndex(index);
	
}

//*********************Manupulation on form elements**********************************************************************************************

//*********************************Functions to set all required fields***********************************************************************
public void setAllRequiredFields(String emailId, String firstName, String lastName, String phone, String address1, String city, String zipCode){
	this.setEmailField(emailId);
	this.setFirstNameField(firstName);
	this.setLastNameField(lastName);
	this.setPhoneField(phone);
	this.setAddress1Field(address1);
	this.setCityField(city);
	this.setZipCodeField(zipCode);
	saveButton.click();
}
public void setAllfields(String middleName, String address2,int index,String country,String taxId,String bankName,String routingNumber,String accountNumber, String profileImage, String status,String emailId, String firstName, String lastName, String phone, String address1, String city, String zipCode)
{
	this.setEmailField(emailId);
	this.setFirstNameField(firstName);
	this.setLastNameField(lastName);
	this.setPhoneField(phone);
	this.setAddress1Field(address1);
	this.setCityField(city);
	this.setZipCodeField(zipCode);
	this.setMiddleNameField(middleName);
	this.setAddress2Field(address2);
	this.setStateField(index);
	this.setTaxIdField(taxId);
	this.setBankNameField(bankName);
	this.setRoutingNumberField(routingNumber);
	this.setAccountNumberField(accountNumber);
	
	saveButton.click();
	
}
}