package app1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import config.BaseTest;
import config.PageObject;

public class HomePage extends PageObject {

	public HomePage() {
		super(BaseTest.driver);
		PageFactory.initElements(BaseTest.driver, this);
	}

	//@FindBy(xpath = "//a[@title='Log in to your customer account']")
	@FindBy(css="a[title='Log in to your customer account']")
	WebElement signInLink;

	public void clickSignInLink() {
		signInLink.click();
	}
}
