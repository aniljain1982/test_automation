package app1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import config.BaseTest;
import config.PageObject;

public class TshirtPage extends PageObject{
	public TshirtPage(){
		super(BaseTest.driver);
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(xpath="//div[@id='center_column']//a[@title='Faded Short Sleeve T-shirts']")
	private WebElement fadedTshirt;
	public void clickOnFadedTshirt()	{
		fadedTshirt.click();
	}
}
