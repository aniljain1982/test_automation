package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject {
	protected WebDriver driver;

	public PageObject(WebDriver driver) {
		this.driver = driver;
	}

	protected WebDriverWait explicitWait(int timeoutInSeconds) {
		return new WebDriverWait(driver, timeoutInSeconds);
	}

	public WebElement waitUntilPresenceOfElementLocated(By by,
			int timeOutInSeconds) {
		return explicitWait(timeOutInSeconds).until(
				ExpectedConditions.presenceOfElementLocated(by));
	}

	public WebElement waitUntilElementIsClickable(WebElement element,
			int timeoutInSeconds) {
		return explicitWait(timeoutInSeconds).until(
				ExpectedConditions.elementToBeClickable(element));
	}
	
	public void switchToFrame(WebElement frame){
		driver.switchTo().frame(frame);
	}
	
	public void switchToDefaultContent(){
		driver.switchTo().defaultContent();
	}
}
