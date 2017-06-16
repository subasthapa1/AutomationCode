package PajeObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddProductTypeForm {
	WebDriver driver;
	public AddProductTypeForm(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH, using=".//*[@id='provider_id']")
	WebElement providerName;
	
	@FindBy(how=How.ID, using="title")
	WebElement productType;
	
	@FindBy(how=How.XPATH, using=".//*[@id='page-content']/div[2]/div/form/div[3]/div/div/button")
	WebElement addProductTypeButton;
	
	@FindBy(how=How.XPATH, using=".//*[@id='page-content']/div[2]/div/form/div[3]/div/div/a")
	WebElement backButton;

	
	void clickBackButton(){
		backButton.click();
	}
	
	
	void clickAddButton(){
		addProductTypeButton.click();
	}
	
	
	public void setProviderName(String provider){
		Select slct=new  Select(providerName);
		slct.selectByVisibleText(provider);
	}
	
	public void setProductTypeTitle(String title){
		productType.clear();
		productType.sendKeys(title);
	}


	
}
