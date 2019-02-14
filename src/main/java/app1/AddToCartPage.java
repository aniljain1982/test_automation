package app1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import config.BaseTest;
import config.PageObject;

public class AddToCartPage extends PageObject{
	public AddToCartPage(){
		super(BaseTest.driver);
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(xpath="//iframe[contains(id,fancybox)]")
	private WebElement frame;
	
	//@FindBy(xpath="//button[@name='Submit']")
	@FindBy(css="button[name='Submit']")
	private WebElement addToCartButton;
	
	public void clickAddToCartButton(){
		switchToFrame(frame);
		addToCartButton.click();
		switchToDefaultContent();
	}
}
