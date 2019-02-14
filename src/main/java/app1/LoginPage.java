package app1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import config.BaseTest;
import config.PageObject;

public class LoginPage extends PageObject {
	protected WebDriver driver;

	public LoginPage() {
		super(BaseTest.driver);
		this.driver = BaseTest.driver;
		
		PageFactory.initElements(driver, this);
	}

	//@FindBy(id = "email")
	@FindBy(css="input#email")
	private WebElement userNameField;

	public void enterUserName(String userName) {
		userNameField.clear();
		userNameField.sendKeys(userName);
	}

	//@FindBy(id = "passwd")
	@FindBy(css="input#passwd")
	private WebElement pwdField;

	public void enterPassword(String pwd) {
		pwdField.clear();
		pwdField.sendKeys(pwd);
	}

	//@FindBy(id = "SubmitLogin")
	@FindBy(css="button#SubmitLogin")
	private WebElement submitButton;

	public void clickSubmitButton() {
		submitButton.click();
	}
}
