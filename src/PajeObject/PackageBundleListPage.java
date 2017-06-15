package PajeObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PackageBundleListPage {
WebDriver driver;
	
	public PackageBundleListPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
//-----------------------------Declaration of elements----------------------------------------------------------
		@FindBy(how=How.XPATH, using=".//*[@id='page-title']/div/a")
		WebElement addPackagesBundleButton;


		@FindBy(how=How.XPATH, using=".//*[@id='page-content']/div[3]/div/form/div/div[3]/div/input")
		WebElement packageBundleSearchBox;
		

		@FindBy(how=How.XPATH, using=".//*[@id='page-content']/div[3]/div/form/div/div[3]/div/span/button")
		WebElement searchButton;
		
		@FindBy(how=How.LINK_TEXT, using="Home")
		WebElement homeLink;
		
		@FindBy(how=How.LINK_TEXT, using="Packages Bundle List")
		WebElement packageBundleList;
		
//-----------------------------Declaration of elements----------------------------------------------------------

		public void clickHomeLink(){
			homeLink.click();
		
		}
		
		public void clickPackageBundleListLink(){
			packageBundleList.click();
		}
		
		public void clickAddPackageBundle(){
			addPackagesBundleButton.click();
		}
		
		public void enterPackageName(String packageName){
			packageBundleSearchBox.clear();
			packageBundleSearchBox.sendKeys(packageName);
		}
		
		public void searchPackageBundle(String packageName){
			enterPackageName(packageName);
			searchButton.click();
		}
}
