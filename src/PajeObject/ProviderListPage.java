package PajeObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProviderListPage {
WebDriver driver;
	
	public ProviderListPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
//-----------------------------Declaration of elements----------------------------------------------------------
		@FindBy(how=How.XPATH, using=".//*[@id='page-title']/div/a")
		WebElement addProviderButton;


		@FindBy(how=How.XPATH, using=".//*[@id='page-content']/div[4]/div/form/div/div[3]/div/input")
		WebElement providerSearchBox;
		

		@FindBy(how=How.XPATH, using=".//*[@id='page-content']/div[4]/div/form/div/div[3]/div/span/button")
		WebElement searchButton;
		
//-----------------------------Declaration of elements----------------------------------------------------------
	
		public void clickAddProviderButton()
		{
			addProviderButton.click();
		}
		
		public void enterProviderName(String providerName){
			providerSearchBox.clear();
			providerSearchBox.sendKeys(providerName);
		}
		
		public void searchPackage(String providerName){
			enterProviderName(providerName);
			searchButton.click();
		}
}
