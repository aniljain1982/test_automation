package app1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import config.BaseTest;
import config.PageObject;

public class ProductPage extends PageObject{
	private WebDriver driver;
	public ProductPage(){
		super(BaseTest.driver);
		this.driver=BaseTest.driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(xpath="//div[@id='block_top_menu']/ul/li[3]//a[.='T-shirts']")
	@FindBy(css="div#block_top_menu > ul > li:nth-child(3) > a")
	private WebElement tshirtMenuItem;
	public void clickTshirtMenuItem(){
		tshirtMenuItem.click();
	}
}
