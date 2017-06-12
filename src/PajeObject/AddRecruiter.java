package PajeObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRecruiter {
	public WebDriver driver;
	public AddRecruiter(WebDriver driver){
		driver=this.driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="enterEmail")
	public WebElement emailField;
	
	@FindBy(id="first_name")
	public WebElement firstNameField;
	
	@FindBy(id="middle_name")
	public WebElement middleNameField;
	
	@FindBy(id="last_name")
	public WebElement lastNameField;
	
	@FindBy(id="phone")
	public WebElement phoneField;
	
	@FindBy(name="addr_line1")
	public WebElement addressLineField1;
	
	@FindBy(name="addr_line2")
	public WebElement addressLineField2;
	
	@FindBy(name="city")
	public WebElement cityField;
	
	@FindBy(id="zip_code")
	public WebElement zipCodeField;
	
	@FindBy(id="tax_id")
	public WebElement taxIdField;
	
	@FindBy(id="bank_name")
	public WebElement bankNameField;
	
	@FindBy(id="routing_number")
	public WebElement routingNumberField;
	
	@FindBy(id="account_number")
	public WebElement accountNumberField;
	
	
	@FindBy(id="profile_pic")
	public WebElement profilePicField;
	
	
	
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
public void setAllRequiredFields(String emailId, String firstName, String lastName, String phone, String address1, String city, String zipCode){
	this.setEmailField(emailId);
	this.setFirstNameField(firstName);
	this.setLastNameField(lastName);
	this.setPhoneField(phone);
	this.setAddress1Field(address1);
	this.setCityField(city);
	this.setZipCodeField(zipCode);
	//WebElement el1=driver.findElement(By.cssSelector("#page-content > div.panel > div > form > div:nth-child(22) > div > div > button"));
	//el1.click();
}
}
